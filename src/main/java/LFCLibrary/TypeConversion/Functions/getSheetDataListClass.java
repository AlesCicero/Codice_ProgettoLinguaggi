/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion.Functions;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class getSheetDataListClass {

    public static List<List<String>> getSheetDataList(Sheet sheet, Integer currentIndexSheet, Vector<dataStructureRow> deleteRowsUser, Vector<dataStructureCol> deleteColsUser) {
        List<List<String>> ret = new ArrayList<>();

        // Get the first and last sheet row number.
        int firstRowNum = sheet.getFirstRowNum();
        int lastRowNum = sheet.getLastRowNum();

        if (lastRowNum > 0) {
            // Loop in sheet rows.
            for (int currentIndexSheetRow = firstRowNum; currentIndexSheetRow < lastRowNum + 1; currentIndexSheetRow++) {

                if (checkClass.deleteRowCheck(deleteRowsUser, currentIndexSheetRow, currentIndexSheet)) {

                    Row row = sheet.getRow(currentIndexSheetRow);

                    // Get first and last cell number.
                    int firstCellNum = row.getFirstCellNum();
                    int lastCellNum = row.getLastCellNum();

                    // Create a String list to save column data in a row.
                    List<String> rowDataList = new ArrayList<>();

                    // Loop in the row cells.
                    for (int currentColIndex = firstCellNum; currentColIndex < lastCellNum; currentColIndex++) {

                        if(checkClass.deleteColCheck(deleteColsUser, currentColIndex, currentIndexSheet)){

                            // Get current cell.
                            Cell cell = row.getCell(currentColIndex);

                            // Get cell type.
                            CellType cellType = cell.getCellType();


                            if (cellType == CellType.NUMERIC) {
                                double numberValue = cell.getNumericCellValue();

                                // BigDecimal is used to avoid double value is counted use Scientific counting method.
                                // For example the original double variable value is 12345678, but jdk translated the value to 1.2345678E7.
                                String stringCellValue = BigDecimal.valueOf(numberValue).toPlainString();

                                rowDataList.add(stringCellValue);

                            } else if (cellType == CellType.STRING) {
                                String cellValue = cell.getStringCellValue();
                                rowDataList.add(cellValue);
                            } else if (cellType == CellType.BOOLEAN) {
                                boolean numberValue = cell.getBooleanCellValue();

                                String stringCellValue = String.valueOf(numberValue);

                                rowDataList.add(stringCellValue);

                            } else if (cellType == CellType.BLANK) {
                                rowDataList.add("");
                            }

                        }
                    }

                    // Add current row data list in the return list.
                    ret.add(rowDataList);
                }
            }
        }
        return ret;
    }
}
