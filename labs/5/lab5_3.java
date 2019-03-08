import java.util.Scanner;
// Import Scanner
public class lab5_3 {
    // Class
    public static void main(String[] args){
        // Main Method
        int i = 0;
        int j = 0;
        // Looping Variables Declared
        Scanner input = new Scanner(System.in);
        // Scanner Class called
        System.out.println("How Many Students are Registered: ");
        int numOfStudent = input.nextInt();
        int[] score = new int[numOfStudent];
        String[] studentNames = new String[numOfStudent];
        // Array's Declared

        while(i < studentNames.length){
            System.out.println("Please Enter the Name of the Student: ");
            studentNames[i] = input.next();
            System.out.println("Please Enter the Score of the Student: ");
            score[i] = input.nextInt();
            i++;
        }
        // While loop that gets name of students and then scores of students

        sortByScore(studentNames, score);
        // Calls soryByScore method with the parameters studentNames and Scores
        while ( j < studentNames.length){
            System.out.println("Name of Student: " + studentNames[j] + "| Score received: " + score[j]);
            j++;
        }
        // While loop that prints out the name of students and their scores
    }

    public static void sortByScore(String[] studentNames, int[] score){
        // Looping Variable Declared
        int i = 0;
        while (i < score.length) {
            int max;
            int maxIndex;
            String tempVar;
            // Variables Initialized
            max = score[i];
            maxIndex = i;


            int j = i + 1;
            // Sets J to the 1 index
            while (j < score.length) {
                if (score[j] > max) {
                    max = score[j];
                    maxIndex = j;
                }
                j++;
            }
            // While loop that compares if score is less thn the current max, if so change current max

            if (maxIndex == 1) {
                i++;
                continue;
            }
            // Checks to see if the maxIndex = 1
            tempVar = studentNames[i];
            studentNames[i] = studentNames[maxIndex];
            studentNames[maxIndex] = tempVar;
            score[maxIndex] = score[i];
            score[i] = max;
            i++;
            // Sets are variables
        }
    }
}