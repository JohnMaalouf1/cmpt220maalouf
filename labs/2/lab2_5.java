import java.util.Scanner;

public class lab2_5 {

    // Main Method
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        // Scanner Class

        System.out.print("Please Enter the first String: ");
        String String1 = input.nextLine();
        System.out.print("Please Enter the second String: ");
        String String2 = input.nextLine();
        // Takes User input and compares them
        int compare = (String1.compareTo(String2));

        // If statement for String values is <= 0
        System.out.println("The Strings in ascending order are: \n");
        if (compare <= 0){
            System.out.println(String1);
            System.out.println(String2);

        }
        // Else Statement
        else {
            System.out.println(String2);
            System.out.println(String1);        }

    }
}
