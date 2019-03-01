import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class lab4_7
{
    static int removeDuplicates(Integer[] arr, int n)
    {
        int[] tempVar = new int[n];
        // Declared Temporary Array of int with the same length
        int j = 0;
        // initialize variable
        for (int i=0; i<n-1; i++) {
            if (!arr[i].equals(arr[i + 1]))
                // Check to see if the two numbers next to each other are equal to each other
                tempVar[j++] = arr[i];
        }
        tempVar[j++] = arr[n-1];

        for (int i=0; i<j; i++)
            arr[i] = tempVar[i];

        return j;
    }

    public static void main(String[] args) {
        // Main Method
        Scanner input = new Scanner(System.in);
        // Scanner Class Called
        System.out.println("How many Numbers are you going to enter: ");
        int userLength = input.nextInt();
        // Takes user Input for size of List

        List<Integer> al = new ArrayList<Integer>();
        // List declared of Integer
        for(int i = 0; i < userLength; i++) {
            int j = input.nextInt();
            al.add(j);
            // Takes userInput and stores it in list
        }
        Collections.sort(al);

        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
        // Converts ArrayList to Array

        int n = arr.length;
        // Gets array Length

        n = removeDuplicates(arr, n);
        // Calls removeDuplicates with parameters

        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        // Prints elements in array
    }
} 