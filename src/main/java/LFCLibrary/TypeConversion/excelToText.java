/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion;

import LFCLibrary.CustomException.ExcelException;
import LFCLibrary.CustomException.InputErrorException;
import LFCLibrary.TypeConversion.Functions.*;
import LFCLibrary.TypeConversion.Functions.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;


public class excelToText {
    public static void creteTextFileFromExcel(String filePathInput, ArrayList<String> filePathOutputArray, HashMap<Integer,String> nameSheetModifying,
                                              Vector<dataStructureRow> deleteRowsUser, Vector<dataStructureCol> deleteColsUser,
                                              Vector<dataStructureModifyCell> modifyCells) throws InputErrorException, ExcelException {
        try{
            /* First need to open the file. */
            FileInputStream fInputStream = new FileInputStream(filePathInput.trim());

            /* Create the workbook object to access excel file. */
            Workbook excelWorkBook = new XSSFWorkbook(fInputStream);


            // Get all excel sheet count of input file
            int totalSheetNumber = excelWorkBook.getNumberOfSheets();
            System.out.println("numero di fogli:  " + totalSheetNumber);

            // Loop in all excel sheet for each sheet
            for(int indexCurrentSheet=0;indexCurrentSheet<totalSheetNumber;indexCurrentSheet++)
            {
                // Get current sheet.
                Sheet sheet = excelWorkBook.getSheetAt(indexCurrentSheet);

                dataStructureModifyCell.modifyingSheetMethod(sheet, indexCurrentSheet, modifyCells);

                if(sheet.getSheetName() != null && sheet.getSheetName().length() > 0)
                {
                    // Get current sheet data in a list table.
                    List<List<String>> sheetDataTable = getSheetDataListClass.getSheetDataList(sheet, indexCurrentSheet, deleteRowsUser, deleteColsUser );

                    // Generate text table format of above sheet data and write to a text file.
                    // Questa funzione mi costruisce lo sheetData che poi mi andrà a creare il file csv
                    //TODO: la modifica o l'eliminazione di righe e colonne, avviene qua dentro
                    String textTableString = getTextTableStringFromList(sheetDataTable);

                    /*
                     * Controllo se l'hashmap è piena e se l'indexCurrentSheet è presente tra i fogli a cui l'utente vuole modificare il nome:
                     * se è presente: cambio il nome al file
                     * se NON è presente: gli lascio il nome originale
                     */
                    String textTableFileName;
                    if (nameSheetModifying == null || nameSheetModifying.isEmpty()  || !nameSheetModifying.containsKey(indexCurrentSheet + 1)){
                        textTableFileName = sheet.getSheetName() + ".txt";

                        // converto effettivamente il file
                    } else {
                        String name_temp[] = nameSheetModifying.get(indexCurrentSheet + 1).split("\"");
                        textTableFileName = name_temp[1] + ".txt";

                        // converto effettivamente il file
                    }
                    if(filePathOutputArray == null || filePathOutputArray.size() == 0){
                        writeStringToFileClass.writeStringToFile(textTableString, textTableFileName, null);
                    }else{
                        for(int i=0; i<filePathOutputArray.size(); i++) {
                            writeStringToFileClass.writeStringToFile(textTableString, textTableFileName, filePathOutputArray.get(i));
                        }

                    }

                }
            }
            // Close excel work book object.
            excelWorkBook.close();
        }catch (FileNotFoundException e) {
            throw new InputErrorException();
        }catch (ExcelException | IOException e){
            throw new ExcelException();
        }
    }

    private static String getTextTableStringFromList(List<List<String>> dataTable)
    {
        StringBuffer strBuf = new StringBuffer();

        if(dataTable != null)
        {
            // Get all row count.
            int rowCount = dataTable.size();

            // Loop in the all rows.
            for(int i=0;i<rowCount;i++)
            {
                // Get each row.
                List<String> row = dataTable.get(i);

                // Get one row column count.
                int columnCount = row.size();

                // Loop in the row columns.
                for(int j=0;j<columnCount;j++)
                {
                    // Get column value.
                    String column = row.get(j);

                    // Append column value and a white space to separate value.
                    strBuf.append(column);
                    strBuf.append("    ");
                }

                // Add a return character at the end of the row.
                strBuf.append("\r\n");
            }

        }
        return strBuf.toString();
    }
}
