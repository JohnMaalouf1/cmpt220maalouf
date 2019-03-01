import java.util.Arrays;
// Import Arrays
public class lab4_6 {
    // Class Declared
    public static void main(String[] args){
        // Main Method
        int[] num = new int[11];
        // Array of 11 ints declared
        fillList(num);
        // Calls Method fillList while passing parameter
        insertList(num);
        // Calls method insertList while passing parameter
    }

    public static void fillList(int[] num){
        num[10] = -1;
        // sets 10th place to -1
        for (int i = 0; i < num.length-1; i++) {
            num[i] = i+1;
        }
        // For loop that fills array with ints 1 - 10
        System.out.println(Arrays.toString(num));
        // Prints array using toString method
    }
    public static void insertList(int[] num){
        // insertNum Method

        num[3] = 10;
        num[7] = 100;
        // Inserts numbers into array places

        System.out.println(Arrays.toString(num));
        // Prints array using toString method
    }
}

