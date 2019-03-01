import java.util.Random;
// Import Random
public class lab4_2 {
    // Class
    public static void main(String[] args) {
        // Main Method
        int max = 122;
        int min = 97;
        // Max and min values for Ascii
        Random r = new Random();
        // Called Random Class

        int[][] numbers = new int[5][5];
        // Declaration of double array

        for (int i = 0; i < numbers.length; i++) {
            numbers[i][i] = r.nextInt((max - min) + 1) + min;

            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = r.nextInt((max - min) + 1) + min;
            }
        }
        // 2 For loop's filling double array with random numbers

        for (int[] number : numbers) {
            for (int i : number) {
                char x = (char) i;
                System.out.print(x + "  ");
            }
            System.out.println("");
        }
        // For each loop converting ints to char The printing them
    }
}

