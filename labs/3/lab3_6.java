import java.util.Scanner;
    // Import Statements
public class lab3_6 {
    // Class Declaration
    public static void main(String[] args){
        // Main method
        Scanner input = new Scanner(System.in);
        // Scanner Class Called
        System.out.print("Please Enter A String: ");
        String userString = input.nextLine();
        // Gets String from user
        int vowelResult = vowelCounter(userString);
        // Declares Variable based on return statement of other method
        System.out.println("The amount of Vowels in the String is: " + vowelResult);
    }

    public static int vowelCounter(String userString){
        // VowelCounter method with parameter userString
        int count = 0;
            // initialized variable
        for (int i =0; i < userString.length(); i++){
            // For loop from 0 to length of String
            if(userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' || userString.charAt(i) == 'o' || userString.charAt(i) == 'u') {
                count++;
                // Checks to see if user String contains vowels, if so increment count
            }
        }return count;
    }
}