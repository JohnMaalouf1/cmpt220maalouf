import java.util.Scanner;
// Import Scanner
public class lab5_7 {
    // Class
    public static void main(String args[]) {
        // Main Method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size of the Matrix: ");
        int row = input.nextInt();
        // Gets Size of Matrix
        double array[][] = new double[row][row];
        // Makes matrix of that size
        System.out.println("Please Fill the Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                array[i][j] = input.nextInt();
            }
        }
        // Fills Matrix with user inout
        System.out.println("Matrix Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
        // Prints Matrix array set by user

       if (isUpperTriangular(array)){
           System.out.println("The Matrix is an Upper triangular");
           // Calls method is upper with the array and prints that if returns true
       }
       else {
           System.out.println("The Matrix is not an Upper triangular");
           // If it does not return true print it is not an upper triangular
       }
    }
    public static boolean isUpperTriangular(double[][] array){
    boolean isUpperTriangular = true;
    // Sets boolean value
        int i = 0;
        // Looping variable Declared
        while (i < array.length) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
            // While loop checking each index, will set to false if not
            if (isUpperTriangular) {
                i++;
            } else {
                break;
            }
            // if else chain that will break and return false if upperTriangular is false
        }
        return isUpperTriangular;
        // Returns boolean value
    }
}