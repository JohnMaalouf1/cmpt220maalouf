import java.util.*;
// Import List, ArrayList, Scanner, and Collections
class lab4_7 {
    // Class
    static int takeOutDuplicates(Integer[] arr, int arrLength) {
        // takeOutDuplicates Method
        int[] tempVar = new int[arrLength];
        // Declared Temporary Array of int with the same length
        int tempVarIndex = 0;
        // initialize variable
        for (int i = 0; i < arrLength-1; i++) {
            if (!arr[i].equals(arr[i + 1]))
                tempVar[tempVarIndex++] = arr[i];
            }
        // For Loop checks to see if the two numbers next to each other are equal to each other
        tempVar[tempVarIndex++] = arr[arrLength-1];
        for (int i = 0; i<tempVarIndex; i++)
            arr[i] = tempVar[i];
        // Fills new Array;
        return tempVarIndex;
    }

    public static void main(String[] args) {
        // Main Method
        System.out.println("Hello User, this program removes duplicate values from an array");
        // Introductory Message
        Scanner input = new Scanner(System.in);
        // Scanner Class Called
        List<Integer> userNumbers = new ArrayList<Integer>();
        // List of Integers Declared
        System.out.println("Please Enter a series of Numbers, end the input by entering a 0" );
        int userInput = input.nextInt();
        while(userInput !=0){
            userNumbers.add(userInput);
            userInput = input.nextInt();
        }
        // takes user input and stores it into list
        Collections.sort(userNumbers);
        // Sorts list by using Collections Class
        Integer[] arr = new Integer[userNumbers.size()];
        arr = userNumbers.toArray(arr);
        // Converts ArrayList to Array
        int n = arr.length;
        // Gets array Length
        n = takeOutDuplicates(arr, n);
        // Calls removeDuplicates with parameters
        System.out.println("The Sorted Numbers Are: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        // Prints elements in array
    }
}

