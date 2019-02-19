import java.util.Scanner;
import java.util.ArrayList;
    // Import Statements
public class lab3_1 {
    // Class Declaration
    private static int sum(ArrayList<Integer> numbers) {
        // Method calculates Sum of numbers in ArrayList.
        int sum = 0;
        for (int i : numbers)
            sum = sum + i;
        return sum;
    }
    private static int evenNumbers(ArrayList<Integer> numbers){
        // Method that calculates Even number in ArrayList.
        int evenNumbers = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }

    private static double average(double total, ArrayList<Integer> numbers){
        // Method average that returns average of ArrayList.
        return total/numbers.size();
    }

    public static void main(String[] args){
        // Main method
        Scanner input = new Scanner(System.in);
        // Scanner Class Called
        System.out.println("Enter a positive integer, the input ends with a 0: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        // ArrayList Declaration
        int userInt = -1;
            // initialized Variable to -1
        while (userInt != 0){
            userInt = input.nextInt();
            if (userInt == 0)
                System.out.print("\n");
            else
                numbers.add(userInt);
        } // While loop with the conditional of not being == 0
        int evenNumbers = evenNumbers(numbers);
        // variable assigned to method return
        int total = sum(numbers);
        // variable assigned to method return
        double average = average(total, numbers);
        // variable assigned to method return

        System.out.println("The number of even numbers: "+ evenNumbers);
        System.out.println("The total sum: " + total);
        System.out.println("The Average is: " + average);
        // Print Statements

    }
}