public class lab3_4 {
    // Class Declaration
    public static void main(String[] args) {
        // Main method
        for (int i = 15000; i > 0; i--) {
            // For loop from 15000 to 0
            if (PrimeCheck(i)) {
                // Calls PrimeCheck Method with parameter I. If conditional if returns true
                System.out.println("The Closest Prime number Less than or Equal to 15000 is " + i);
                System.exit(0);
                // Exits Program
            }
        }
    }

    static boolean PrimeCheck(int n) {
        // Method PrimeCheck that returns True if number is prime or False if number is not prime
        for (int i = 2; i < n; i++) {
            // For loop that check to see if given number (n) is prime
            if (n % i == 0)
                return false;
            // If not prime
        }
        return true;
        // If Prime
    }
}