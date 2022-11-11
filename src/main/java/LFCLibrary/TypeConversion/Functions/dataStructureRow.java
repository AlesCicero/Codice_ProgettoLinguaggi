/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion.Functions;

public class dataStructureRow {

    public dataStructureRow(Integer sheetIndex, Integer indexRowDelete) {
        this.sheetIndex = sheetIndex;
        this.indexRowDelete = indexRowDelete;
    }
    final  private int sheetIndex;
    final private int indexRowDelete;

    public int getSheetIndex() {
        return sheetIndex;
    }

    public int getIndexRowDelete() {
        return indexRowDelete;
    }

    @Override
    public String toString() {
        return "dataStructureRow{" +
                "sheetIndex=" + sheetIndex +
                ", indexRowDelete=" + indexRowDelete +
                '}';
    }
}
