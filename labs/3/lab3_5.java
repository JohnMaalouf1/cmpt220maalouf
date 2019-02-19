import java.util.Scanner;
    // Import Statements
public class lab3_5 {
    // Class Declaration
    public static void main(String []args){
        // Main method
        Scanner input = new Scanner(System.in);
        // Scanner Class Called
        System.out.println("Please Enter The First Number" );
        double numberOne = input.nextDouble();
        System.out.println("Please Enter The Second Number");
        double numberTwo = input.nextDouble();
        System.out.println("Please Enter The Third Number");
        double numberThree = input.nextDouble();
        // Takes in 3 numbers from user
        double average = average(numberOne, numberTwo, numberThree);
        // Calls method average and passes the three parameters
        System.out.println(average);
        // Prints Result
    }

    public static double average(double a, double b, double c){
        // Method average that returns the average of the three numbers
        return (a + b + c) / 3;
    }
}