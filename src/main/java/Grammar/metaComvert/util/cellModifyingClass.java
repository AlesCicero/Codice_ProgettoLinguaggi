package Grammar.metaComvert.util;

public class cellModifyingClass<I, R, C, V> {

    public I index;
    public R row;
    public C col;
    public V value;

    public cellModifyingClass(I index, R row, C col, V value) {
        this.index = index;
        this.row = row;
        this.col = col;
        this.value = value;
    }
}
