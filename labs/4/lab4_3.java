import java.util.Scanner;

public class lab4_3 {
    // Main Method
    public static void main(String[]args){
        // Scanner Class Called
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a String to check if it is Palindrome!");
        System.out.print("----> ");
        // User Input
        String userString = input.nextLine();
        // Prints out result of method
        System.out.println(isPalindrome(userString));
    }

    public static boolean isPalindrome(String palindromTest){
        // Declared Boolean testPalindrome
        boolean testPalindrome;
        // If statement calls reverse method to and compares results
        if (palindromTest.equals(reverse(palindromTest))){
            testPalindrome = true;
            // returns true if strings equal each other
        }
        else
            testPalindrome = false;
        // Otherwise returns false
        return testPalindrome;
    }

    public static String reverse(String reverseTest){
        // String initialized
        String reverseString = "";
        for(int i = reverseTest.length() - 1; i >= 0; i--)
        {
            reverseString = reverseString + reverseTest.charAt(i);
        }
        return reverseString;
    }
}
