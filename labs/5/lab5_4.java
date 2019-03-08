import java.util.Arrays;
// Import Arrays
import java.util.Scanner;
// Import Scanner
public class lab5_4 {
    // Class
    public static void main(String[] args) {
        // Main Method
        Scanner input = new Scanner(System.in);
        // Scanner Class Called
        System.out.println("Please Enter the Length of the First Array: ");
        int arryXLen = input.nextInt();
        System.out.println("Please Enter the Length of the Second Array: ");
        int arryYLen = input.nextInt();
        // Gets length of the arrays


        int []x = new int[arryXLen];
        int []y = new int[arryYLen];
        // Makes arrays

        System.out.println("Please Fill the First Array");
        for (int i = 0; i < arryXLen; i++){
            x[i] = input.nextInt();
        }
        // Fills first Array with for loop

        System.out.println("Please Fill the Second Array");
        for (int i = 0; i < arryYLen; i++){
            y[i] = input.nextInt();
        }
        // Fills second Array with for loop

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        // Prints arrays
        if (equal(x, y)){
            System.out.println("The two arrays are identical.");
        }
        // If the equal method returns true print they are equal
        else {
            System.out.println("The two arrays are not identical.");
        }
        // If not, print they are not
    }

    public static boolean equal(int[] x, int[] y) {
        int xLen = x.length;
        int yLen = y.length;
        // Gets length of array

        if (xLen != yLen){
            return false;
        }
        // If the array sizes are not equal then the arrays are not equal, return false

        Arrays.sort(y);
        Arrays.sort(y);
        // Sorts arrays using sort method

        for (int i = 0; i < xLen; i++)
            if (x[i] != x[i])
                return false;
            // Loops through and check to see if the index of the arrays differs, if to return false
        return true;
        // return true if it gets passed that
    }
}
