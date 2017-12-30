/**
 * ReadIRPfile: The class to read the comma-delimited file.
 * 
 * @author Sonali Kondapalli
 * @version September 2015
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadIRPfile { 
    private String path;
    private ArrayList<IRPair> textDataAL = new ArrayList<IRPair>();

    public ReadIRPfile (String file_path) {
        path = file_path;
    }

    public ArrayList<IRPair> OpenFile() throws IOException {
        // Add a FileReader and BufferedReader to read the file.
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        String aLine;
        try { 
            while(( aLine = textReader.readLine()) != null){
                // This is for comma-delimited files.
                int commaPosition = 0; 
                String match = ",";
                commaPosition = aLine.indexOf(match); 

                // Find the separate inputs based on the comma.
                String input = aLine.substring(0,commaPosition);
                String response = aLine.substring(commaPosition+1);              
                IRPair irp = new IRPair(input,response);
                textDataAL.add(irp);
            }
        } finally {
            // Close the reader.
            textReader.close();
        }
        return textDataAL;
    }

    public ArrayList<IRPair> getIRPairs(){
        return textDataAL;
    }
}
