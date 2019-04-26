import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// Import Statements

public class Problem_3{
    // Class

    public static void main(String[] args) {
        // Main()

        if(args.length!=2){
            System.out.println("Please provide two parameters");
            System.exit(0);
        }
        // Checks if both parameters are passed, if so then exit

        try{

            Scanner myFile = new Scanner(new File(args[1]));
            // Gets File name from second index of array

            String lineNum = "";
            //Initialized lines

            while(myFile.hasNextLine()){

                String line = myFile.nextLine();
                line = line.replaceAll(args[0], "");
                lineNum += line+"\n";
                // While there are more lines in the text file, loop through the given word, parameter 0, and replace with ""
            }

            myFile.close();
            // Closes Files

            PrintWriter pw = new PrintWriter(new File(args[1]));
            //Created new file using printwrite with the same name as the original file overwriting it

            pw.println(lineNum);
            // Writes the new lines to the new files
            pw.close();
            // Close the PrintWriter

        }catch(FileNotFoundException e){
            System.out.println("Unable to open file");
        }
        // Catch FileNotFoundException and prints Unable to Open File

    }

}

