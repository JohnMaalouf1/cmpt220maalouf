package lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class sortDriver {
    public static void main(String args[])
    {
        ArrayList<Integer> userNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n=0;

        for(int i = 0; i<5; i++)
        {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            userNumbers.add(number);
            n++;
        }

        ArrayListSort.sort(userNumbers);
        System.out.println("The sorted numbers are :\n");
        System.out.print(userNumbers);

    }
}
