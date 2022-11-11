/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion.Functions;

import java.util.Vector;


public class checkClass {

    public static boolean deleteRowCheck(Vector<dataStructureRow> deleteRowsUser, int indexCurrentRow, int indexCurrentSheet){

        if(deleteRowsUser.isEmpty()){
            return true;
        }

    for(dataStructureRow element: deleteRowsUser){
         if(element.getSheetIndex() - 1 == indexCurrentSheet && element.getIndexRowDelete() - 1 == indexCurrentRow){
             return false;
         }
        }
    return true;

    }


    public static boolean deleteColCheck(Vector<dataStructureCol> deleteColsUser, int indexCurrentCol, int indexCurrentSheet){

        if(deleteColsUser.isEmpty()){
            return true;
        }

        for(dataStructureCol element: deleteColsUser){
            if(element.getSheetIndex() - 1 == indexCurrentSheet && element.getIndexColDelete() - 1 == indexCurrentCol){
                return false;
            }
        }
        return true;

    }

    public static boolean modifyingCellCheck(Vector<dataStructureModifyCell> modifyCells, int indexCurrentSheet, int indexRowCurrent, int indexColCurrent){


        if(modifyCells == null || modifyCells.isEmpty()) {return false;}

        for(dataStructureModifyCell element : modifyCells){
            if(element.getSheetIndex() - 1 == indexCurrentSheet && element.getIndexRow() - 1 == indexRowCurrent && element.getIndexCols() - 1 == indexColCurrent){
                return true;
            }
        }

        return false;

    }
}
