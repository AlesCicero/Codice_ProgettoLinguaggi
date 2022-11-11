/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import LFCLibrary.CustomException.ExcelException;
import LFCLibrary.CustomException.InputErrorException;
import LFCLibrary.TypeConversion.Functions.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import net.sf.json.JSONObject;


public class excelToJson {

    public static void createJSONFileFromExcel(String filePathInput, ArrayList<String> filePathOutputArray, HashMap<Integer,String> nameSheetModifying,
                                               Vector<dataStructureRow> deleteRowsUser, Vector<dataStructureCol> deleteColsUser,
                                               Vector<dataStructureModifyCell> modifyCells)
            throws InputErrorException, ExcelException {
        try{
            /* First need to open the file. */
            FileInputStream fInputStream = new FileInputStream(filePathInput.trim());

            /* Create the workbook object to access excel file. */
            Workbook excelWorkBook = new XSSFWorkbook(fInputStream);


            // Get all excel sheet count of input file
            int totalSheetNumber = excelWorkBook.getNumberOfSheets();
            System.out.println("numero di fogli:  " + totalSheetNumber);

            // Loop in all excel sheet for each sheet
            for (int indexCurrentSheet = 0; indexCurrentSheet < totalSheetNumber; indexCurrentSheet++)
            {
                // Get current sheet.
                Sheet sheet = excelWorkBook.getSheetAt(indexCurrentSheet);

                dataStructureModifyCell.modifyingSheetMethod(sheet, indexCurrentSheet, modifyCells);

                 if(sheet.getSheetName() != null && sheet.getSheetName().length() > 0)
                {
                    // Get current sheet data in a list table.
                    // Questa funzione mi costruisce lo sheetData che poi mi andrà a creare il file csv
                    // TODO: la modifica o l'eliminazione di righe e colonne, avviene qua dentro
                    List<List<String>> sheetDataTable = getSheetDataListClass.getSheetDataList(sheet, indexCurrentSheet,  deleteRowsUser, deleteColsUser);

                    // Generate JSON format of above sheet data and write to a JSON file.
                    String jsonString = getJSONStringFromList(sheetDataTable);

                    /*
                     * Controllo se l'hashmap è piena e se l'indexCurrentSheet è presente tra i fogli a cui l'utente vuole modificare il nome:
                     * se è presente: cambio il nome al file
                     * se NON è presente: gli lascio il nome originale
                     */
                   if (nameSheetModifying == null || nameSheetModifying.isEmpty()  || !nameSheetModifying.containsKey(indexCurrentSheet + 1))
                    {
                        String jsonTableFileName = sheet.getSheetName() + ".json";

                        // converto effettivamente il file
                        if(filePathOutputArray.size() == 0 || filePathOutputArray == null){
                            writeStringToFileClass.writeStringToFile(jsonString, jsonTableFileName, null);
                        }else{
                            for(int i=0; i<filePathOutputArray.size(); i++) {
                                writeStringToFileClass.writeStringToFile(jsonString, jsonTableFileName, filePathOutputArray.get(i));
                            }

                        }

                    } else {
                        String name_temp[] = nameSheetModifying.get(indexCurrentSheet + 1).split("\"");
                        String jsonTableFileName =name_temp[1] + ".json";

                        // converto effettivamente il file
                       if(filePathOutputArray == null ||filePathOutputArray.size() == 0){
                           writeStringToFileClass.writeStringToFile(jsonString, jsonTableFileName, null);
                       }else{
                           for(int i=0; i<filePathOutputArray.size(); i++) {
                               writeStringToFileClass.writeStringToFile(jsonString, jsonTableFileName, filePathOutputArray.get(i));
                           }

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


    private static String getJSONStringFromList(List<List<String>> dataTable)
    {
        String ret = "";

        if(dataTable != null)
        {
            int rowCount = dataTable.size();

            if(rowCount > 1)
            {
                // Create a JSONObject to store table data.
                JSONObject tableJsonObject = new JSONObject();

                // The first row is the header row, store each column name.
                List<String> headerRow = dataTable.get(0);

                int columnCount = headerRow.size();

                // Loop in the row data list.
                for(int i=1; i<rowCount; i++)
                {
                    // Get current row data.
                    List<String> dataRow = dataTable.get(i);

                    // Create a JSONObject object to store row data.
                    JSONObject rowJsonObject = new JSONObject();

                    for(int j=0;j<columnCount;j++)
                    {
                        String columnName = headerRow.get(j);
                        String columnValue = dataRow.get(j);


                        rowJsonObject.put(columnName, columnValue);
                    }

                    tableJsonObject.put("Row " + i, rowJsonObject);
                }

                // Return string format data of JSONObject object.
                ret = tableJsonObject.toString();

            }
        }
        return ret;

    }


}
