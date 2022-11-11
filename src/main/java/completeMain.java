import LFCLibrary.TypeConversion.converterExcelToType;
import Grammar.metaComvert.*;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class completeMain {

    public static void main(String[] args) throws IOException, RecognitionException {
       
        String fileName = "./resources/input.file";

        System.out.println ("Parsing con ANTLR");

        converterExcelToType cET = new converterExcelToType();


        FileReader fileIn = new FileReader(fileName);

        metacomvertParser parser = new metacomvertParser(fileIn, cET);
        parser.language();


        System.out.println("FINE DEL PARSER");
        System.out.println("lista degli errori : ");
        
        int index = 0;
        
        if(  cET.errorList  != null ) {
        
        	for (Token var : cET.errorList) 
        	{ 
        	
        		System.err.println("ERROR Token Type num:  [" + index + "] , [row, col] : [" + var.getLine()+ "," + var.getCharPositionInLine() + "],  "
        				+ "Contenuto del Token: 	" + var.getText());
        		index++;

        	}
        	
        }
        
        else if (parser.getErrorList().size() != 0) {
        	int i = 0;
			System.out.println ("*******************");
			for (String msg : parser.getErrorList())
				System.err.println (++i + " - " + msg);
        	
        }
        else {
        	System.out.println("Non sono presenti caratteri sconosciuti all'interno della grammatica");
            cET.converter(); 
        }
        
        
   }

}
