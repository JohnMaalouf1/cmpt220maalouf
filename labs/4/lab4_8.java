import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class lab4_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr=new ArrayList<Integer>(100);
        System.out.println("Please Enter a Number" );
        int userInput=input.nextInt();
        while(userInput != 0) {
            arr.add(userInput);
            userInput= input.nextInt();
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
