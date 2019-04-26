
import java.util.Random;
import java.util.Scanner;
// Import Statements

public class lab9_1 {
    // Class Declaration

    public static void main(String[] args){
        Random rand = new Random();
        // Random Class called
        Scanner input = new Scanner(System.in);
        // Scanner Class called
        int userArray[] = new int[100];
        // Array of 100 integers
        for (int i = 0; i < userArray.length; i ++){
            int n = rand.nextInt();
            userArray[i] = n;
        }
        // Filling array with 100 random integers
        System.out.println("What cell would you like to access (0-99)");
        int userSelect = input.nextInt();
        try{
            System.out.println(userArray[userSelect]);
            // Try to print out array cell
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of bounds");
            // Print out error if cell is out of bounds
        }

    }
}
