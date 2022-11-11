package LFCLibrary.CustomException;

import java.io.FileNotFoundException;

public class OutputErrorException extends FileNotFoundException {

    public OutputErrorException() {
        super("ERROR: wrong output path: not exist.");
    }

    public OutputErrorException(String message) {
        super(message);
    }
}

