
import java.util.Scanner;
// Import Scanner

public class BinaryToString {
    // Class

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Scanner class Called
        System.out.println("Please Enter a Binary String");
        // Prompts for user input
        String numString = input.nextLine();
        // Takes input from user
        bin2Dec(numString);
        // Calls Method with passed variable
    }

    private static void bin2Dec(String numString) {
        int sum =0;
        // Int Variable Declared
        for (int i = 0; i <  numString.length(); i ++){
            if (numString.charAt(i) == '1'){
                sum += Math.pow(2, numString.length() -1 -i);
                //Converts binary number to int
            }
            else if (numString.charAt(i) != '0'){
                throw new NumberFormatException("Not a Binary String");
            }
            // Throws error "Not a Binary String" if the char is not a 1 or 0
        }
        System.out.println(sum);
        // For loop checks to
    }
}
