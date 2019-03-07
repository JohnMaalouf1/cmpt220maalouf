import java.util.Scanner;
// Import Scanner
public class prog1Completed {
    // Class
    static Scanner input = new Scanner(System.in);
    // Static Scanner for all methods
    public static void main (String[] args) {
        // Main Method
        int heightInput;
        int widthInput;
        int brickCount;
        // Initialized and Declared Int variable
        heightInput = input.nextInt();
        widthInput = input.nextInt();
        brickCount = input.nextInt();
        // Takes user input
        if (checkWall(heightInput, widthInput, brickCount)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    static boolean checkWall(int heightInput, int widthInput, int brickCount){
        // CheckWall Method with Parameters
        int wallWidth = 0;
        int wallHeight = 0;
        // Variables Declared
        for(; brickCount!= 0; brickCount--){
            // For loop based on brickCount
            int size;
            size = input.nextInt();
            // Declared Size Variable
            if (heightInput > wallHeight) {
                wallWidth = wallWidth + size;
                // Modifies The Wall's Width after compared with the height
                if (wallWidth == widthInput) {
                    wallHeight++;
                    wallWidth = 0;
                    // Increases wall height if enough brick are present
                } else if (wallWidth > widthInput) {
                    wallHeight = heightInput + 1;
                    // Increases wallHeight if the width is greater than the userInput width
                }
                if (wallHeight == heightInput) {
                    return true;
                    // Returns true if the wall height matches the input Height
                }
            }
        }
        return false;
    }
}

