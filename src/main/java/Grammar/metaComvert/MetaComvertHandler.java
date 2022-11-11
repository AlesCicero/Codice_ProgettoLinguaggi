package Grammar.metaComvert;
import Grammar.metaComvert.metacomvertParser;
import Grammar.metaComvert.util.Delete;
import Grammar.metaComvert.util.cellModifyingClass;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.*;

import LFCLibrary.TypeConversion.Functions.dataStructureCol;
import LFCLibrary.TypeConversion.Functions.dataStructureModifyCell;
import LFCLibrary.TypeConversion.Functions.dataStructureRow;
import LFCLibrary.TypeConversion.converterExcelToType;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;



// Classe che servirà per introdurre la logica.

public class MetaComvertHandler {
	
	public static final int UNDEFINED = -1;	
	public static final int TOKEN_ERROR = 0;	
	public static final int ERR_ON_SYNTAX = 1;	
	public static final int LAST_SYNTAX_ERROR = 40;	
	public static final int DECLARED_METHOD = 50;

	public converterExcelToType cET;

		
	// oggetti che passerò alla libreria 
	
	String input_path = new String();
	ArrayList<String> output_path = new ArrayList<>();
	ArrayList<String> set_conversion = new ArrayList<>();
	ArrayList<Delete<String,String>> delete_row = new ArrayList<>();
	ArrayList<Delete<String,String>> delete_col = new ArrayList<>();
	ArrayList<cellModifyingClass<Integer, Integer , Integer, String>> cellModifyingArrayList = new ArrayList<>();
	
	/* Oggetti per la gestione degli errori */
	ArrayList<Token> errorList = new ArrayList<>();
	TokenStream lexerStream;
	
	//nuova aggiunta 
	ArrayList<String> errorList1;

	
	public MetaComvertHandler (TokenStream ls, converterExcelToType cETT) {
		
		System.out.println ("Handler Inizializzato");
		errorList = new ArrayList<Token>();
		errorList1 = new ArrayList<>();
		lexerStream = ls;
		cET = cETT;
	}
	
	// Nuova aggiunta 
	
	public List<String> getErrorList() { // MESSAGGI DI ERRORE
		return errorList1;
	}
	
	public void handleError(String[] tokenNames, RecognitionException e, String h, String m) {
		String type = "";
		String st;
		
		if (e.token.getType() >=0)
			type = tokenNames[e.token.getType()]; 
		if (e.token.getType() == metacomvertLexer.SCAN_ERROR)
			st = "Errore lessicale  " + TOKEN_ERROR + " a ";
		else
			st = "Errore sintattico  " + ERR_ON_SYNTAX + " a ";
		
		st +=	"[" + e.token.getLine() + ", " + (e.token.getCharPositionInLine()+1) + "]: " + 
				"Trovato ";
		st += type;
		st += " ('" + e.token.getText() + "')" + m;

		if (e instanceof MissingTokenException)
		   st = st + m;		
		
		errorList1.add(st); 
	}
	
	
	
	// Gestione errori semantici
	
	void myErrorHandler(int code, Token tk) {
		String st;
		if (code == TOKEN_ERROR)
			st = "Errore lessicale " + code;
		else if (code < LAST_SYNTAX_ERROR)
			st = "Errore sintattico " + code;
		else
			st = "Errore semantico " + code; 
	
		if (tk != null)
			st += " avvenuto qui: [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		st += ". ";

		if (code == TOKEN_ERROR)
			st += "Token non riconosciuto'" + tk.getText() + "'";
		else if (code == DECLARED_METHOD)
			st += "Metodo " + tk.getText() + " già dichiarato.";
							
		errorList1.add(st); 
	}
	

	public void setInputPath(Token i) {
		System.out.println("INPUTPATH handler");
		if(i == null) {
			cET.setPathInputFile(null);
		}else {
		
		input_path = i.getText();
		String input_path_split[] = input_path.split("\"");
		
		cET.setPathInputFile(input_path_split[1]);
		}	
		}
	public void setOuputPath(ArrayList<Token> o) {

		System.out.println("OUTPUTPATH handler");

		for(int i = 0;i<o.size();i++) {
			
			if(o.get(i)!= null) {
				
				String percorso[] = o.get(i).getText().split("\"");
				
				File file = new File(percorso[1]);
				if(file.isDirectory() == true ) {
					System.out.println("il percorso : " + percorso [1] +" e'  corretto  " );
					output_path.add(o.get(i).getText());
				}
				else {
					System.err.println("WARNING!!!   il percorso : " + percorso [1] +" e' risultato  scorretto... ");
					System.err.println("Se è l'unico output verrà messo nel path del file di conversione");
					System.err.println("Se sono presente altri destinazioni di output, allora non verrà considerato ");
					
				}

				
			}
			else {	// ERRORE DA GESTIRE
			  
				System.err.println(" WARNING: Missing correct output path: the library saves files in the input path ");
				
			}
			
		}
		

		cET.setPathOutputFile(output_path);

	}
	public void setConversionType(ArrayList<Token> cT) {

		System.out.println("SETCONVERSION handler: ");
		if(cT != null) {
		for(int i = 0; i<cT.size();i++) {
			if(cT.get(i) != null) {				
				set_conversion.add(cT.get(i).getText());
			}
			else {	
				System.out.println("C'è stato un ERRORE");
			}
						
		}
		cET.setConversionTypeArray(set_conversion);
		
		}


	}
	public void setSheetName(Map<Token,Token> nS) { // Beppe
		System.out.println("SHEET MODIFYING NAME Hanler: ");
		
		HashMap<Integer,String> nameSheetMod = new HashMap<>();		
		for (Map.Entry<Token, Token> entry : nS.entrySet()) {
			
			
			if (entry.getKey().getType()  == metacomvertParser.STRINGA) {
				
				System.err.println("ERROR LINE: " + entry.getKey().getLine() +
						", Parametri errati[ " + entry.getKey().getText() + ":" + entry.getValue().getText() +  "], l'input non verra considerato ");
			}
			else {
			nameSheetMod.put(Integer.valueOf(entry.getKey().getText()), entry.getValue().getText());
			}
		}
		

		cET.setNameSheetModifying(nameSheetMod);
	}
	public void fusionDelete (ArrayList<Delete<Token,Token>> riga,ArrayList<Delete<Token,Token>> colonna){

		
		Vector<dataStructureRow> tempDeleteRow = new Vector<>();
		Vector<dataStructureCol> tempDeleteCol = new Vector<>();
		
	
		for(int i = 0; i< riga.size();i++) { // inserimento righe nel map
			
			
			if(riga.get(i).chiave.getType() == metacomvertParser.STRINGA ) {
				System.err.println("ERROR LINE: " + riga.get(i).chiave.getLine() +
			", Parametri errati[ " + riga.get(i).chiave.getText() + ":" + riga.get(i).valore.getText() +  "], l'input non verra considerato ");
			}
			else {
				dataStructureRow temp = new dataStructureRow (Integer.valueOf(riga.get(i).chiave.getText()) ,Integer.valueOf( riga.get(i).valore.getText()) );
				tempDeleteRow.add(temp);
			}
		}

		
		for(int j = 0; j< colonna.size();j++) { // inserimento colonne nel map
			if(colonna.get(j).chiave.getType() == metacomvertParser.STRINGA) {
				System.err.println("ERROR LINE: " + colonna.get(j).chiave.getLine() +
			", Parametri errati[ " + colonna.get(j).chiave.getText() + ":" + colonna.get(j).valore.getText() +  "], l'input non verra considerato ");
			}
			else {
				// nuovo 
				dataStructureCol temp1 = new dataStructureCol (Integer.valueOf(colonna.get(j).chiave.getText()) ,Integer.valueOf( colonna.get(j).valore.getText()) );
				tempDeleteCol.add(temp1);
			}

		}

		cET.setDeleteRowsUser(tempDeleteRow);
		cET.setDeleteColsUser(tempDeleteCol);
	}

	public void modifyingCellMeth(ArrayList<cellModifyingClass<Token, Token, Token, Token>> cellM  ){

		Vector<dataStructureModifyCell> temp_cell_vector = new Vector<>();
		
		for(int i = 0; i< cellM.size();i++) { // inserimento righe nel map
			
			if(cellM.get(i).index.getType() != metacomvertParser.INT || cellM.get(i).row.getType() != metacomvertParser.INT || cellM.get(i).col.getType() != metacomvertParser.INT) {
				System.err.println("ERROR LINE: " +cellM.get(i).index.getLine() +
						", Parametri errati[ index, row, col, value ] = [ " + cellM.get(i).index.getText() + "," +cellM.get(i).row.getText() +  ","
									+ cellM.get(i).col.getText() + ", " + cellM.get(i).value.getText() +  "], l'input non verra considerato ");
			}
			else {
			int index = Integer.parseInt(cellM.get(i).index.getText());
			int row = Integer.parseInt(cellM.get(i).row.getText());
			int col = Integer.parseInt(cellM.get(i).col.getText());
			int value = cellM.get(i).value.getType();
			if(value == metacomvertParser.INT){
				dataStructureModifyCell cellTemp = new dataStructureModifyCell(index, row, col,Integer.valueOf(cellM.get(i).value.getText()));
				temp_cell_vector.add(cellTemp);
			} else {
				dataStructureModifyCell cellTemp = new dataStructureModifyCell(index, row, col, cellM.get(i).value.getText());
				temp_cell_vector.add(cellTemp);
			}
		}
		
		}
		
		cET.setModifyCells(temp_cell_vector);
	}
	
	
	public void printError(Token eLG) {
		
		errorList.add(eLG);
		cET.setErrorList(errorList);
		
	}
	
}
