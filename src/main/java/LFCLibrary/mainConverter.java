package LFCLibrary; /**
 *
 * @author : Giuseppe Mirra
 *
 */

import java.io.IOException;


import LFCLibrary.TypeConversion.Functions.dataStructureCol;
import LFCLibrary.TypeConversion.Functions.dataStructureModifyCell;
import LFCLibrary.TypeConversion.Functions.dataStructureRow;
import LFCLibrary.TypeConversion.converterExcelToType;
import LFCLibrary.TypeConversion.excelToCsv;
import LFCLibrary.TypeConversion.excelToJson;
import LFCLibrary.TypeConversion.excelToText;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;




/* flusso del codice
 * 1: leggere il tipo di conversione per entrare nel case switch
 * 2: leggere il file excel in input
 * 3: cercare righe e colonne da eliminare all'interno del vettore dei dati
 * 4: cercare righe e colonne da modificare
 * 5: creare file in uscita con i nomi personalizzati
 * 6: dare il file in uscita
 */


public class mainConverter {

    String excelInPath = "C:\\Users\\mirra\\Desktop\\LinguaggiProgetto\\testConversion.xlsx";

    public static void main(String[] args) throws IOException {



        String excelFilePath = "C:\\Users\\mirra\\Desktop\\LinguaggiProgetto\\testConversion.xlsx";
        String fileOutputPath = "C:\\Users\\mirra\\Desktop\\LinguaggiProgetto\\Prova1";


        ArrayList<String> pathOutputFileArray = new ArrayList<>();

        /* type conversion */
        String CSV  = "CSV";
        String Json = "JSON";
        String text = "TEXT";

        ArrayList<String> typeConversionArray = new ArrayList<>();
        typeConversionArray.add(CSV);
        typeConversionArray.add(Json);
        typeConversionArray.add(text);
        typeConversionArray.add("CSS");

      /* new sheet name from user (From metalanguage) */
        HashMap<Integer,String> nameSheetModifying = new HashMap<>();
        nameSheetModifying.put(1, "Foglio1");
        nameSheetModifying.put(2, "Foglio2");
        nameSheetModifying.put(3, "Foglio3");
        nameSheetModifying.put(4, "Foglio4");

        /* rows delete user Key = sheet number, value: delete row index */
        Vector<dataStructureRow> deleteRowsUser = new Vector<>();


        /* cols delete user Key = sheet number, value: delete cols index */
        Vector<dataStructureCol> deleteColsUser = new Vector<>();


        /* vector for modifying cell field */
        Vector<dataStructureModifyCell> modifyCells = new Vector<>();
        modifyCells.add(new dataStructureModifyCell(2,2,4,100));

        




    }
}
