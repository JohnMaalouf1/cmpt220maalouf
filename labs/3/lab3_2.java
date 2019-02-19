public class lab3_2 {
    // Class Declaration
    public static void main(String[] args){
        // Main method
        int newLine = 0;
            // initialized variable
        for (int i = 100; i < 500; i++) {
            // For loop from 100 to 500
            if ((i % 5) == 0 || (i % 7 == 0) ^ (i % 5) == 0 && (i % 7 == 0)) {
                //Check to see if number is divisible by 5 or 7, but not both
                    System.out.print(i + " ");
                    newLine++;
                    if(newLine % 10 == 0)
                        System.out.println();
                        // After ever 10, print new line
            }
        }
    }
}