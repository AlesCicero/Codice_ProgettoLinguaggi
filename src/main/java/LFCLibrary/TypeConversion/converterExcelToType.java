/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion;

import LFCLibrary.CustomException.InputErrorException;
import LFCLibrary.TypeConversion.Functions.dataStructureCol;
import LFCLibrary.TypeConversion.Functions.dataStructureModifyCell;
import LFCLibrary.TypeConversion.Functions.dataStructureRow;
import org.antlr.runtime.Token;


import java.util.*;


public class converterExcelToType {

    public converterExcelToType() {}

    public converterExcelToType(String pathInputFile, ArrayList<String> pathOutputFile, ArrayList<String> conversionTypeArray, HashMap<Integer,String> nameSheetModifying,
                                Vector<dataStructureRow> deleteRowsUser, Vector<dataStructureCol> deleteColsUser, Vector<dataStructureModifyCell> modifyCells, ArrayList<Token> errorList ) {
        this.pathInputFile = pathInputFile;
        this.pathOutputFile = pathOutputFile;
        this.conversionTypeArray = conversionTypeArray;
        this.nameSheetModifying = nameSheetModifying;
        this.deleteRowsUser = deleteRowsUser;
        this.deleteColsUser = deleteColsUser;
        this.modifyCells = modifyCells;
        this.errorList = errorList;

    }

    public String pathInputFile;
    public ArrayList<String> pathOutputFile;
    public ArrayList<String> conversionTypeArray;
    public HashMap<Integer,String> nameSheetModifying;
    public Vector<dataStructureRow> deleteRowsUser  = new Vector<>();
    public Vector<dataStructureCol> deleteColsUser = new Vector<>();
    public Vector<dataStructureModifyCell> modifyCells;
    public ArrayList<Token> errorList;

    public void setPathInputFile(String pathInputFile) {
        this.pathInputFile = pathInputFile;
    }
    public void setPathOutputFile(ArrayList<String> pathOutputFile) {
        this.pathOutputFile = pathOutputFile;
        for (String output: pathOutputFile) {
        }
    }
    public void setConversionTypeArray(ArrayList<String> conversionTypeArray) {

        this.conversionTypeArray = conversionTypeArray;

    }
    public void setNameSheetModifying(HashMap<Integer, String> nameSheetModifying) {
        this.nameSheetModifying = nameSheetModifying;


    }


    public void setDeleteRowsUser(Vector<dataStructureRow> deleteRow) {

    		  this.deleteRowsUser = deleteRow;
    
        }

    	  
    	  

    	  
    public void setDeleteColsUser(Vector<dataStructureCol> deleteCol) {
    		  
    	
    	this.deleteColsUser = deleteCol;

    }
    public void setModifyCells(Vector<dataStructureModifyCell> modifyCells) {
        this.modifyCells = modifyCells;
    }
    
    public void setErrorList(ArrayList<Token> list2Grammar) {
    	this.errorList = list2Grammar;
    }

    public void converter() throws InputErrorException {
        
        if(pathInputFile == null ||pathInputFile.isEmpty() || pathInputFile.length() == 1){
           throw new InputErrorException("ERROR: input path string not valid");
        }
        
        if(conversionTypeArray == null ||conversionTypeArray.isEmpty() || conversionTypeArray.size() < 1){
        	
            throw new InputErrorException("ERROR: convertions type is not valid" );
         }
         
         

        for (String conversionType: conversionTypeArray) {
             switch (conversionType) {
                case "\"CSV\"" ->
                        excelToCsv.createCSVFileFromExcel(this.pathInputFile, this.pathOutputFile, this.nameSheetModifying, this.deleteRowsUser, this.deleteColsUser, this.modifyCells);
                case "\"JSON\"" ->
                        excelToJson.createJSONFileFromExcel(this.pathInputFile, this.pathOutputFile, this.nameSheetModifying, this.deleteRowsUser, this.deleteColsUser, this.modifyCells);
                case "\"TXT\"" ->
                        excelToText.creteTextFileFromExcel(this.pathInputFile, this.pathOutputFile, this.nameSheetModifying, this.deleteRowsUser, this.deleteColsUser, this.modifyCells);
                default -> System.err.println("ERROR: type conversion  '"+ conversionType + "'  is not supported or it wrong");
            }

        }




    }

}
