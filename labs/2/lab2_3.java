import java.util.Random;
import java.util.Scanner;

public class lab2_3 {

    // Main Method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Scanner and Random Classes

        System.out.println("Hello User, this program takes two numbers and will generate a random number between them!\n");
        // Print Statements
        System.out.print("Please Enter the Lower Limit: ");
        int lowerNumber = input.nextInt();
        System.out.print("Please Enter the Higher Limit: ");
        int higherNumber = input.nextInt();
        // Takes upper and lower

        if (lowerNumber >= higherNumber){
            System.out.println("The Lower Limit cannot be greater than or equal to the Higher Limit!");
        } else {

            // Takes higher - lower + lower to make the necessary boundaries
         for (int i = 0; i < 3; i ++){
            int randNumber = rand.nextInt(higherNumber - lowerNumber) + lowerNumber;
            System.out.println("The random number is: " + randNumber);
         }

            // Print statement
        }
    }
}
