import java.util.Scanner;


class Testjdk {

    static void getOccuringChar(String UserInput)
    {
        int countChar[] = new int[256];

        for (int i = 0; i < UserInput.length(); i++)
            countChar[UserInput.charAt(i)]++;

        char charCount[] = new char[UserInput.length()];

        for (int i = 0; i < UserInput.length(); i++) {
            charCount[i] = UserInput.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (UserInput.charAt(i) == charCount[j])
                    find++;
            }
            if (find == 1)
                System.out.println("Number of Occurrence of " +
                        UserInput.charAt(i) + " is:" + countChar[UserInput.charAt(i)]);
        }
    }
    public static void main(String[] args) {
        // Main method
        System.out.println("Hello user, This program counts the amount of Characters in a Sentence!\n"
                + "Please Enter Your Sentence: ");
        // Introductory Statement
        Scanner input = new Scanner(System.in);
        // Scanner class called
        String userInput = input.nextLine();
        String userInputCleaned = userInput.replaceAll("[^a-zA-Z0-9]", "");
        // Takes userInput and cleans it up with Regex/Replacement
        getOccuringChar(userInputCleaned);
        // CountChar Method called
    }
}