/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion.Functions;

public class dataStructureCol {

    public dataStructureCol(Integer sheetIndex, Integer indexColDelete) {
        this.sheetIndex = sheetIndex;
        this.indexColDelete = indexColDelete;
    }
    final  private int sheetIndex;
    final private int indexColDelete;

    public int getSheetIndex() {
        return sheetIndex;
    }

    public int getIndexColDelete() {
        return indexColDelete;
    }

    @Override
    public String toString() {
        return "dataStructureCol{" +
                "sheetIndex=" + sheetIndex +
                ", indexColDelete=" + indexColDelete +
                '}';
    }
}