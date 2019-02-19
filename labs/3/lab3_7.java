public class lab3_7 {
    // Class Declaration
    public static void main(String[] args){
        // Main Method
        int newLine = 1;
            // initialized variable
        for (int n = 1; n < 50; n++){
            // For loop from 1 to 50
            System.out.print(PentNumCalc(n) + " ");
            // Prints Result of method PentNumCalc with Parameter n
            if(newLine % 10 == 0)
                System.out.println();
            newLine++;
            // After ever 10, print new line
        }
    }

    public static int PentNumCalc(int n) {
        // Method PenNumCalc that returns the Pentagonal Number for n
        return (n * (3 * n - 1)) / 2;
    }
}