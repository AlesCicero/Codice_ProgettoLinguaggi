grammar metacomvert;

options{
language = Java;
k = 1;
}

@lexer::header{
	package Grammar.metaComvert;
}

@lexer::members{

}

@header{
package Grammar.metaComvert;

	// Inserire le import per costruttore (vedere @members )
	//SE SI VUOLE UTILIZZARE IL FILE ParserLauncher
	
import Grammar.metaComvert.util.*;
import Grammar.metaComvert.MetaComvertHandler;
import java.io.IOException;
import java.io.StringReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import LFCLibrary.TypeConversion.*;



}

@members{

// ************************************ inizio Analizzatore semantico

MetaComvertHandler h;


// ****************************************** Parte scanner e parser 
	public metacomvertParser(FileReader fileIn, converterExcelToType cET) throws  IOException{
				this(new CommonTokenStream(
								new metacomvertLexer(
										new ANTLRReaderStream(fileIn))));
		
				h = new MetaComvertHandler(input, cET);
			}
			
public MetaComvertHandler getHandler() {
    return h;
  }
  
			
			
public List<String> getErrorList () {
    return h.getErrorList();
  }
	public void displayRecognitionError(String[] tokenNames,
                                       RecognitionException e) {
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		  
		h.handleError(tokenNames, e, hdr, msg);
  }





//**


}


// INIZIO GRAMMATICA , language = assioma
language 
	: 
	 STARTDOC wsc body wsc  ENDDOC 
	;
	

	body	:	
	
		//inPath: contains the value returned by the rule
		(inPath = inpath{h.setInputPath(inPath);})
		
		
		wsc
		
		//outPath: contains the value returned by the rule
		(outPath = outpath{h.setOuputPath(outPath);})?
		
		
		
		wsc
		
		//convTok: contains the value returned by the rule
		(convTok = conversion { h.setConversionType(convTok);} )
		
		
		wsc
		
		//nameSheet: contains the value returned by the rule
		(nameSheet = namesheet { h.setSheetName(nameSheet);})?
	
		
		wsc
		
		(delete)?
		
		
		wsc
		
		
		//modCell: contains the value returned by the rule
		(modCell = modifyingcell{h.modifyingCellMeth(modCell);})?
	
		;

wsc	:	
	(WS | COMMENT| scanerror)* 
	;


inpath returns[Token t]
	:	
	 STARTINPATH (startInPath = path { t = startInPath;}) ENDINPATH   wsc 
	;
	
	
	
path	returns [Token t]
	:	
	wsc BAOPEN (baOpen = STRINGA {t = $baOpen;})  BACLOSE  wsc 
	;
	
	
//  If in the input.file is put the null or incorrect outpath token takes as output path the input path
outpath	 returns[ArrayList<Token> outPath]

@init {outPath = new ArrayList<Token>();}
	:	
	
	STARTOUTPATH (startOutPath =path { outPath.add(startOutPath);})+ ENDOUTPATH  
	
	;
	
	
conversion returns [ArrayList<Token> convTok]
	:	
	
	STARTCONVERSION wsc ( convType = type{ convTok = convType;}) wsc ENDCONVERSION
	
	;
	
namesheet returns [Map<Token, Token> nameSheet]
	:	
	
	STARTNAMESHEET ( nameSh = sheet { nameSheet = nameSh;}) wsc ENDNAMESHEET
	
	;
	
sheet	returns [Map<Token,Token> nameSheet]

@init { nameSheet = new HashMap<Token, Token>();}
	:	
	
	(wsc BAOPEN SHEETINDEX COLON ( indexSheet = (INT|STRINGA) ){System.out.println("tipo : "+ indexSheet.getType());} 
	COMMA NEWNAMESHEET  COLON 
	( nameSh = STRINGA {nameSheet.put(indexSheet, nameSh);} )  BACLOSE wsc)+
	
	;


type returns [ArrayList<Token> convType]

@init { convType = new ArrayList<Token>();}
	:		
	(BAOPEN) (convType1 = STRINGA {convType.add(convType1);}) (BACLOSE) wsc 
	( (BAOPEN)  (convType2 = STRINGA {convType.add(convType2);} ) ( BACLOSE))? wsc
	((BAOPEN) (convType3 = STRINGA {convType.add(convType3);}) (BACLOSE))?  
	
	;


delete
	:
	
	STARTDELETE wsc  (r = row )? wsc (c = col)? wsc ENDDELETE
	{
	if( r != null && c != null)
		h.fusionDelete(r,c);
	else if(c == null && r != null){
		ArrayList<Delete<Token,Token>> c1 = new ArrayList<Delete<Token,Token>>();
		h.fusionDelete(r,c1);
	}
	else if (c != null && r == null) {
		ArrayList<Delete<Token,Token>> r1 = new ArrayList<Delete<Token,Token>>();
		h.fusionDelete(r1,c);
	}
	else if (c == null && r == null){
		ArrayList<Delete<Token,Token>> r1 = new ArrayList<Delete<Token,Token>>();
		ArrayList<Delete<Token,Token>> c1 = new ArrayList<Delete<Token,Token>>();
		h.fusionDelete(r1,c1);
	
	}
	}
	
	;

row	returns [ArrayList<Delete<Token,Token>> row]
	:	
	
	STARTROW (deleteRow = todelete{row = deleteRow;}) ENDROW
	
	;
	
col	returns [ArrayList<Delete<Token,Token>> col]
	:
	
	STARTCOL (deleteCol = todelete{col = deleteCol;}) ENDCOL
	
	;
	
todelete returns [ArrayList<Delete<Token,Token>> d]

@init{ d = new ArrayList<>();}
	:	
	
	(wsc BAOPEN SHEETINDEX COLON (index = (INT | STRINGA)) COMMA INDEXDELETE COLON 
	(del = INT{Delete p= new Delete(index,del); d.add(p);})
	 BACLOSE wsc )+ 
	 
	;
	

	
modifyingcell returns [ArrayList<cellModifyingClass<Token,Token,Token,Token>> modifyCell]
	:	
	
	STARTMODIFYINGCELL (modCell = modcell{modifyCell = modCell;}) ENDMODIFYINGCELL
	
	;

modcell	returns [ArrayList<cellModifyingClass<Token,Token,Token,Token>> modifyCell]

@init {modifyCell = new ArrayList<>();}	
	:
	
	(wsc BAOPEN SHEETINDEX COLON (indexSheet = (INT | STRINGA)) COMMA 
	ROW COLON (rowMod = (INT | STRINGA)) COMMA COL COLON ( colMod = (INT | STRINGA)) COMMA 
	NEWVALUE COLON ( valueCell = (INT | STRINGA)
	 {cellModifyingClass ce = new cellModifyingClass(indexSheet,rowMod,colMod,valueCell); modifyCell.add(ce);})
	  BACLOSE wsc )+ 	
	  
	;
scanerror //returns [ArrayList<Token> scr]
//@init {scr = new ArrayList<>();}	
	:	 
	sc = SCAN_ERROR {h.printError($sc);}
	;
	
ENDDOC	:
	'#ENDDOCUMENT'	
	;
STARTDOC 	:
	'#STARTDOCUMENT'	
	;
	
STARTINPATH:	'#STARTINPATH'
	;
	
ENDINPATH:	'#ENDINPATH'
;

STARTOUTPATH:	'#STARTOUTPATH'
	;
	
ENDOUTPATH:	'#ENDOUTPATH'
;

STARTCONVERSION:	
	'#STARTTYPECONVERSION'
	;
	
ENDCONVERSION:	
	'#ENDTYPECONVERSION'
;

STARTNAMESHEET:	
	'#STARTNAMESHEET'
	;
	
ENDNAMESHEET:	
	'#ENDNAMESHEET'
;


STARTDELETE
	:	
	'#STARTDELETE'
	;
ENDDELETE
	:	
	'#ENDDELETE'
	;

STARTMODIFYINGCELL
	:	
	'#STARTMODIFYINGCELL'
	;
ENDMODIFYINGCELL
	:	
	'#ENDMODIFYINGCELL'
	;
STARTROW:	
	'#STARTROW'
	;
ENDROW	:	
	'#ENDROW'
	;

STARTCOL:	
	'#STARTCOL'
	;
ENDCOL	:	
	'#ENDCOL'
	;
SHEETINDEX
	:
	'sheetIndex'	
	;
NEWNAMESHEET
	:
	'nameSheet'	
	;
INDEXDELETE
	:	
	'indexDelete'
	;
COLON	:
	':'	
	;
COL	:
	'col'	
	;
ROW	:
	'row'
	;
NEWVALUE:
	'value'	
	;

	

STRINGA	:	
	'"' ( options {greedy=false;} : . )* '"'
	;
COMMENT
    :   
    '*%' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '%*' ( options {greedy=false;} : . )* '*%'
    ;
    

 WS :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )
    ;
 BAOPEN	:	
 	'<'
 	;
 BACLOSE:	
 	'>'
 	;
 COMMA 	:	
 	','
 	;
 INT 	:	
 	('0'..'9')+
 	;

SCAN_ERROR  : . ;
