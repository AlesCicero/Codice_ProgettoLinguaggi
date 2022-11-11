package LFCLibrary.CustomException;

import java.io.FileNotFoundException;

public class InputErrorException extends FileNotFoundException {

    public InputErrorException() {
        super("ERROR: wrong input path: not exist.");
    }

    public InputErrorException(String message) {
        super(message);
    }
}
