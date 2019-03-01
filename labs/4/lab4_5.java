import java.util.Random;
public class lab4_5 {
    // Class Declared

    public static void main(String[] args){
        // Main Method
        Random r = new Random();

        int n = 1000;
        double sum = 0;
        int countAbove = 0;
        int countBelow = 0;
        double average;

        // Variables Declared

        double[] numbers = new double[n];
        // Array of numbers Declared

        // For loop randomizing 1000 ints
        for( int i = 0; i < n; i ++){
            numbers[i] = r.nextInt(999) + 1;
            sum += numbers[i];
        }
        // Calculate average
        average = sum/n;

        // For loop that counts numbers above the average
        for (int i =0; i < n; i++)
            if (numbers[i] > average)
                countAbove++;
        // For loop that counts numbers below the average
        for (int i =0; i < n; i++)
            if (numbers[i] < average)
                countBelow++;
        // Print Statements
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + countAbove);
        System.out.println("Number of elements below the average is " + countBelow);

    }
}
