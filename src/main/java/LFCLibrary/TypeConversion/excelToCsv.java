/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion;

import LFCLibrary.CustomException.ExcelException;
import LFCLibrary.CustomException.InputErrorException;
import LFCLibrary.TypeConversion.Functions.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class excelToCsv {

    public static void createCSVFileFromExcel(String filePathInput, ArrayList<String> pathOutputFileArray, HashMap<Integer,
            String> nameSheetModifying, Vector<dataStructureRow> deleteRowsUser,
                                              Vector<dataStructureCol> deleteColsUser, Vector<dataStructureModifyCell> modifyCells )
    throws InputErrorException, ExcelException {
    	
    	
    	

        try {
            // Get the workbook object for XLS file
            FileInputStream fInputStream = new FileInputStream(filePathInput.trim());
            Workbook excelWorkBook = new XSSFWorkbook(fInputStream);

            // Get all excel sheet count of input file
            int totalSheetNumber = excelWorkBook.getNumberOfSheets();
            System.out.println("numero di fogli:  " + totalSheetNumber);

            // Loop in all excel sheet for each sheet
            for (int indexCurrentSheet = 0; indexCurrentSheet < totalSheetNumber; indexCurrentSheet++) {

                // Get current sheet.
                Sheet sheet = excelWorkBook.getSheetAt(indexCurrentSheet);

                dataStructureModifyCell.modifyingSheetMethod(sheet, indexCurrentSheet, modifyCells);

                if(sheet.getSheetName() != null && sheet.getSheetName().length()>0){

                    // Questa funzione mi costruisce lo sheetData che poi mi andrà a creare il file csv
                    //TODO: la modifica o l'eliminazione di righe e colonne, avviene qua dentro
                    List<List<String>> sheetDataTable = getSheetDataListCsv(sheet, indexCurrentSheet, deleteRowsUser, deleteColsUser );

                    // modifico i dati da tabella a lista per riempire il file csv
                    String csvTableString = getCsvTableStringFromList(sheetDataTable);

                    /*
                    * Controllo se l'hashmap è piena e se l'indexCurrentSheet è presente tra i fogli a cui l'utente vuole modificare il nome:
                    * se è presente: cambio il nome al file
                    * se NON è presente: gli lascio il nome originale
                    */
                    String textTableFileName;
                    if (nameSheetModifying == null || nameSheetModifying.isEmpty()  || !nameSheetModifying.containsKey(indexCurrentSheet + 1)){
                        textTableFileName = sheet.getSheetName() + ".csv";

                    } else {
                        String name_temp[] = nameSheetModifying.get(indexCurrentSheet + 1).split("\"");
                        textTableFileName = name_temp[1] + ".csv";

                    }

                    if( pathOutputFileArray == null || pathOutputFileArray.size() == 0){
                        writeStringToFileClass.writeStringToFile(csvTableString, textTableFileName, null);
                    }else{
                        for(int i=0; i<pathOutputFileArray.size(); i++) {
                            String temp_out[] = pathOutputFileArray.get(i).split("\"");
                            writeStringToFileClass.writeStringToFile(csvTableString, textTableFileName, pathOutputFileArray.get(i));
                        }

                    }


                }
            }
        }catch (FileNotFoundException e) {
            throw new InputErrorException();
        }catch (ExcelException | IOException e){
            throw new ExcelException();
        }
    }



    private static String getCsvTableStringFromList(List<List<String>> dataTable){

        StringBuilder strBuf = new StringBuilder();
        if (dataTable != null) {



            // Loop in the all rows.
            for (List<String> row : dataTable) {
                // Get each row.
                // Get one row column count.
                int columnCount = row.size();

                // Loop in the row columns.
                for (int j = 0; j < columnCount; j++) {
                    // Get column value.
                    String column = row.get(j);

                    // Append column value and a white space to separate value.
                    strBuf.append(column);

                }

                // Add a return character at the end of the row.
                strBuf.deleteCharAt(strBuf.length() - 1);
                strBuf.append("\n");
            }


        }
     return strBuf.toString();
    }


    private static List<List<String>> getSheetDataListCsv(Sheet sheet, Integer currentIndexSheet,
                                                          Vector<dataStructureRow> deleteRowsUser, Vector<dataStructureCol> deleteColsUser){
        // getSheetDatalist
        List<List<String>> ret = new ArrayList<List<String>>();

        // Get the first and last sheet row number.
        int firstRowNum = sheet.getFirstRowNum();
        int lastRowNum = sheet.getLastRowNum();

        if (lastRowNum > 0) {
            // Loop in sheet rows.
            for (int currentIndexSheetRow = firstRowNum; currentIndexSheetRow < lastRowNum + 1; currentIndexSheetRow++) {


                    if(checkClass.deleteRowCheck(deleteRowsUser, currentIndexSheetRow, currentIndexSheet)){

                        // Get current row object.
                        Row row = sheet.getRow(currentIndexSheetRow);

                        int firstCellNum = row.getFirstCellNum();
                        int lastCellNum = row.getLastCellNum();

                        // Create a String list to save column data in a row.
                        List<String> rowDataList = new ArrayList<String>();

                        // Loop in the row cells.
                        for (int currentColIndex = firstCellNum; currentColIndex < lastCellNum; currentColIndex++) {

                            if(checkClass.deleteColCheck(deleteColsUser, currentColIndex, currentIndexSheet)){

                                // Get current cell.
                                Cell cell = row.getCell(currentColIndex);

                                // Get cell type.
                                CellType cellType = cell.getCellType();



                                rowDataList.add("\"");
                                if (cellType == CellType.NUMERIC) {
                                    double numberValue = cell.getNumericCellValue();

                                    // BigDecimal is used to avoid double value is counted use Scientific counting method.
                                    // For example the original double variable value is 12345678, but jdk translated the value to 1.2345678E7.
                                    String stringCellValue = BigDecimal.valueOf(numberValue).toPlainString();

                                    rowDataList.add(stringCellValue + "\"" + ",");

                                } else if (cellType == CellType.STRING) {
                                    String cellValue = cell.getStringCellValue();
                                    rowDataList.add(cellValue + "\"" + ",");
                                } else if (cellType == CellType.BOOLEAN) {
                                    boolean numberValue = cell.getBooleanCellValue();

                                    String stringCellValue = String.valueOf(numberValue + "\"" + ",");

                                    rowDataList.add(stringCellValue + "\""  + ",");

                                } else if (cellType == CellType.BLANK) {
                                    rowDataList.add("");

                                }



                            }



                            }
                        ret.add(rowDataList);
                    }

                }

            }

        return ret;
    }

}



