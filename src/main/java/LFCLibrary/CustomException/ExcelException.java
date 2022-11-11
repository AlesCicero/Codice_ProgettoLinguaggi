package LFCLibrary.CustomException;

public class ExcelException extends RuntimeException{
    public ExcelException() {
        super("ERROR: open excel file is Failed .");
    }

    public ExcelException(String message) {
        super(message);
    }
}
