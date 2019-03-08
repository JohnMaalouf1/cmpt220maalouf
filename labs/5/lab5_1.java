import java.util.Scanner;
// Import Scanner
public class lab5_1 {
    // Class
    public static void main(String[] args){
        // Main Method
        Scanner input = new Scanner(System.in);
        // Scanner Class Called
        double[] userInput = new double[10];
        // Array of 10 doubles declared
        for (int i = 0; i < userInput.length; i++){
            System.out.println("Please Enter a Number: ");
            userInput[i] = input.nextDouble();
        }
        // For loop loops through array waiting for user input

        double maxValue = max(userInput);
        // Declared Variable from result of max Method
        System.out.println("The Maximum Value is: " + maxValue);
        //Prints maxValue
    }
    public static double max(double[] array) {
        // Mac method with array passed to it
        double max;
        // Variable Declared
        max = array[0];
        // sets the max value to the first index of the array
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            // Loops through array checking current value against Max, if it is larger, reassign max value
        }
        return max;
        // Returns Max

    }
}

