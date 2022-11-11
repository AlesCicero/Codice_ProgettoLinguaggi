/**
 *
 * @author : Giuseppe Mirra
 *
 */
package LFCLibrary.TypeConversion.Functions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeStringToFileClass {

     public static void writeStringToFile(String data, String fileName, String outputFilePath)
    {


        try
        {
            String filePath;
            // Get the output file absolute path.
            if(outputFilePath == null){
                String currentWorkingFolder = System.getProperty("user.dir");

                // Get file path separator.
                String filePathSeperator = System.getProperty("file.separator");

                // Get the output file absolute path.
                filePath = currentWorkingFolder + filePathSeperator + fileName;
            } else {
                String filepath_split[] = outputFilePath.split("\"");
                filePath = filepath_split[1] + fileName;
            }

            // Create File, FileWriter and BufferedWriter object.
            File file = new File(filePath);

            FileWriter fw = new FileWriter(file);

            BufferedWriter buffWriter = new BufferedWriter(fw);

            // Write string data to the output file, flush and close the buffered writer object.
            buffWriter.write(data);

            buffWriter.flush();

            buffWriter.close();

            System.out.println(filePath + " has been created.");

        }catch(IOException ex)
        {
            System.err.println("ERROR: Invalid error output path");
        }
    }

}
