import java.util.ArrayList;
// Import ArrayList
import java.util.Scanner;
// Import Scanner
import java.util.Collections;
// Import Collections
public class lab4_8 {
    // Class
    public static void main(String[] args){
        // Main Method
        System.out.println("Hello User, this Program will read a sequence of positive real numbers\n" +
                "and will print the same numbers in sorted order from smallest to largest\n");
        // Introductory Message
        Scanner input = new Scanner(System.in);
        // Scanner Class Called
        ArrayList<Integer> arr=new ArrayList<Integer>(100);
        // ArrayList declared, max size is 100
        System.out.println("Please Enter a series of Numbers, end the input by entering a 0:");
        int userInput=input.nextInt();
        // Takes User input
            while (userInput != 0) {
                if (!(userInput < 0)) {
                    arr.add(userInput);
                    userInput = input.nextInt();
                }
                else {
                    System.out.println("You have not entered a positive number\nQuitting Program");
                    break;
                }
            }

        Collections.sort(arr);
        System.out.println("The Ordered Numbers are: ");
        System.out.println(arr);
    }
}
