import java.util.Scanner;
// Import Scanner
public class lab5_6 {
    // Class
    static Scanner input = new Scanner(System.in);
    // Static Scanner allows for it to be used in all methods
    public static void main(String[] args) {
        // Main Method
        System.out.println("Enter The Size of the Matrix: ");
        int row = input.nextInt();
        // Gets size of matrix
        double[][] array = new double[row][row];
        // Makes matrix based on size
        System.out.println("Please Fill the Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                array[i][j] = input.nextInt();
            }
        }
        // User is prompted to fill matrix with two looping vairbles

        System.out.println("Matrix Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Prints Matrix as set by the user
        System.out.println("Please Enter the Column you would like to compute the average of");
        int userColumn = input.nextInt();
        // Takes user input of column
        averageRow(array, userColumn);
        // Calls averageRow method with the userColumn
    }

    public static void averageRow(double[][] array, int column){
        // X is set to 0
        double x = 0;
        for (int j = 0; j < array.length; j++) {
            x += array[column][j];
        }
        // Gets average by adding all numbers in array column and diving by the length of array
        System.out.println("The average of the "+ column + " column is " + x/array.length);
    }
}
