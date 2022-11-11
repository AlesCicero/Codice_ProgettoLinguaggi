/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion.Functions;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class dataStructureModifyCell {

    final  private int sheetIndex;
    final  private int indexRow;
    final  private int indexCols;
    final  private Object cellValue;

    public dataStructureModifyCell(int sheetIndex, int indexRow, int indexCols, Object cellValue) {
        this.sheetIndex = sheetIndex;
        this.indexRow = indexRow;
        this.indexCols = indexCols;
        this.cellValue = cellValue;
    }

    public int getSheetIndex() {return sheetIndex;}
    public int getIndexRow() {return indexRow;}
    public int getIndexCols() {return indexCols;}
    public Object getCellValue() {return cellValue;}


    public static void modifyingSheetMethod(Sheet sheet, int indexCurrentSheet, Vector<dataStructureModifyCell> modifyCells){

        if(sheet.getSheetName() != null && sheet.getSheetName().length()>0) {

            int firstRowNum = sheet.getFirstRowNum();
            int lastRowNum = sheet.getLastRowNum();

            if (lastRowNum > 0) {

                for (int currentIndexSheetRow = firstRowNum; currentIndexSheetRow < lastRowNum + 1; currentIndexSheetRow++) {

                    Row row = sheet.getRow(currentIndexSheetRow);
                    int firstCellNum = row.getFirstCellNum();
                    int lastCellNum = row.getLastCellNum();

                    for (int currentColIndex = firstCellNum; currentColIndex < lastCellNum; currentColIndex++) {
                        Cell cell = row.getCell(currentColIndex);

                        if(checkClass.modifyingCellCheck(modifyCells,indexCurrentSheet,currentIndexSheetRow,currentColIndex)){
                                Object obj = getVectorValue(modifyCells,indexCurrentSheet,currentIndexSheetRow, currentColIndex);
                                if(obj instanceof Integer && cell.getCellType() == CellType.NUMERIC){

                                    cell.setCellValue((int)obj);
                                } else if (obj instanceof Double && cell.getCellType() == CellType.NUMERIC){

                                	cell.setCellValue((double)obj);

                                    cell.setCellValue((boolean)obj);
                                } else if (obj instanceof String && cell.getCellType() == CellType.STRING){
                                    String temp_string[] = ((String) obj).split("\"");
                                    cell.setCellValue(temp_string[1]);
                                } else if(cell.getCellType() == CellType.BLANK){
                                    cell.setCellValue("");
                                }

                        }


                    }
                }

            }
        }
    }

    public static Object getVectorValue(Vector<dataStructureModifyCell> modifyCells,int indexCurrentSheet, int indexRowCurrent, int indexColCurrent){
        for(dataStructureModifyCell element : modifyCells) {
            if (element.getSheetIndex() - 1 == indexCurrentSheet && element.getIndexRow() - 1 == indexRowCurrent && element.getIndexCols() - 1 == indexColCurrent) {
                return element.getCellValue();
            }
        }
            return null;
    }

    @Override
    public String toString() {
        return "dataStructureModifyCell{" +
                "sheetIndex=" + sheetIndex +
                ", indexRow=" + indexRow +
                ", indexCols=" + indexCols +
                ", cellValue=" + cellValue +
                '}';
    }
}
