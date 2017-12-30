/**
 * IRPair: Arranges and formats the text on the receipt file.
 * 
 * @author Sonali Kondapalli
 * @version September 2015
 */

import java.util.Arrays;

public class IRPair
{
    String input; String response;
    int strlength;
    String spaces;
    String s;
    
    public IRPair(String i, String r){
        this.input = i;
        this.response = r;
        
        // Get the length of the first string and count the spaces needed.
        strlength = input.length();
        int count = 20 - strlength;

        // Add the appropriate amount of spaces into a string. Build the string.
        StringBuilder sb = new StringBuilder(count);
        for (int strlength=0; strlength < count; strlength++){
            sb.append(" ");
        }
        s = sb.toString();
   }

    public String getResponse(){
        return response;
    }

    public String getInput(){
        return input;
    }

    public String toString(){
        // Return the strings with the calculated spaces.
        return input + s + response;
    }
}
