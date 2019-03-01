import java.util.Random;

public class lab4_2 {
    public static void main(String[] args) {
        // Max and min values for Ascii
        int max = 122;
        int min = 97;

        // Called Random Class
        Random r = new Random();

        // Declaration of double array
        int[][] numbers = new int[5][5];

        // 2 For loop's filling double array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i][i] = r.nextInt((max - min) + 1) + min;

            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = r.nextInt((max - min) + 1) + min;
            }

            }//end for loop

        // For each loop converting ints to char
        for (int[] number : numbers) {
            for (int i : number) {
                char x = (char) i;
                System.out.print(x + "  ");
            }

            System.out.println("");
        }
    }
}

