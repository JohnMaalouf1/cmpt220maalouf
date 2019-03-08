import java.util.Scanner;
// Import Scanner
public class lab5_5 {
    // Class
    public static void main(String[] args) {
        // Main Method
        System.out.println("Enter The Size of the Matrix: ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        // Gets size of Matrix
        int[][] array = new int[row][row];
        // Makes matrix of that size

        System.out.println("Please Fill the Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                array[i][j] = input.nextInt();
                System.out.print(" ");
            }
            // Fills double array with 2 looping variables, J and I
        }


        System.out.println("\nMatrix Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        // Prints out the array as set by the user


        System.out.println("Matrix Array Transposed: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }
        // Prints out the transposed array, they way this was achieved was by swapping the i and j index positions
    }
}
