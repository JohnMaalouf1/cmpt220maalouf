import java.util.Scanner;
// Import Scanner
public class lab5_2 {
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

        double std = deviation(userInput);
        System.out.println("The Standard Deviation: " + std);

    }
    public static double deviation(double[] x){

        double std = 0.0;
        int length = x.length;
        double mean = mean(x);
        for(double num: x) {
            std += Math.pow(num - mean, 2);
        }
        return Math.sqrt(std/length);
    }

    public static double mean(double[] x){
        double sum = 0.0;
        for (double i : x)
            sum += i;
        sum = sum/x.length;
        System.out.println("The Mean: " + sum);
        return sum;
    }
}

