/**
 * FileData: The class to read and write out text file input and output.
 * 
 * @author Sonali Kondapalli
 * @version September 2015
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileData {
    public static void main(String[] args) throws IOException {
        // Set the paths to each of these strings.
        String file_name = "textfile.txt";
        String file_name2 = "receipts.txt";

        System.out.println("Please check receipts.txt for your foramtted text file.");
        try {
            // Read the text file and arrange the lines in an array.
            ReadIRPfile file = new ReadIRPfile(file_name);
            ArrayList<IRPair> aryLines = file.OpenFile();

            // Write the lines in the array to the receipt file.
            FileWriter write = new FileWriter(file_name2, false);
            PrintWriter print_line = new PrintWriter(write);

            int i;
            for (i=0; i < aryLines.size(); i++){
                // Write the lines onto the reciept.
                print_line.println(aryLines.get(i));
            }

            //Close the file.
            print_line.close();

            // Error handling.
        } catch (IOException e) {
            System.out.println("You have an error.");
        }
    }
}