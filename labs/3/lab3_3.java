public class lab3_3 {
    // Class Declaration
    public static void main(String[] args){
        // Main method
        int newLine = 0;
            // initialized variable
        for(int i=1; i<101; i++) {
            // For loop from 100 to 500
            System.out.print((char) i + " ");
            // Converts to ascii then prints
            newLine++;
            if(newLine % 10 == 0)
                System.out.println();
                // After ever 10, print new line
        }
    }
}
