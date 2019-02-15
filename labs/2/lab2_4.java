import java.util.Scanner;

public class lab2_4 {

    // Main Method
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        // Scanner Class

        System.out.print("Please Enter the First Character: ");
        char char1 = input.next().charAt(0);
        System.out.print("Please Enter the Second Character: ");
        char char2 = input.next().charAt(0);
        // Takes in user input

        // Converts to int
        int number1 = char1;
        int number2 = char2;

        // Print statement
        System.out.println(number1 + number2);



    }
}
