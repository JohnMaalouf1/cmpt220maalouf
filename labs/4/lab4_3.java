import java.util.Scanner;
// Import Scanner
public class lab4_3 {
    // Class
    public static void main(String[]args){
        // Main Method
        Scanner input = new Scanner(System.in);
        // Scanner Class Called
        System.out.println("Please Enter a String to check if it is Palindrome: ");
        String userString = input.nextLine();
        // User Input
        System.out.println(isPalindrome(userString));
        // Prints out result of method
    }
    public static boolean isPalindrome(String palindromeTest){
        // Declared Boolean testPalindrome
        boolean testPalindrome;
        if (palindromeTest.equals(reverse(palindromeTest))){
            // If statement calls reverse method to and compares results
            testPalindrome = true;
            // returns true if strings equal each other
        }
        else {
            testPalindrome = false;
            // Otherwise returns false
        }
        return testPalindrome;
    }

    public static String reverse(String reverseTest){
        // Reverse Method called
        String reverseString = "";
        // String initialized

        for(int i = reverseTest.length() - 1; i >= 0; i--) {
            reverseString = reverseString + reverseTest.charAt(i);
        }
        // For loop that reverse String
        return reverseString;
    }
}
