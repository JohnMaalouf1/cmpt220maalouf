import java.util.Scanner;

public class lab1_3 {

    public static void main(String[] args){

        System.out.println("Hello User, This programs converts Ounces to Grams");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a Value for Ounces: ");
        double ounces = scan.nextDouble();
        double grams = ounces *  28.3495;
        System.out.println(ounces + " Ounces is " + grams + " Grams");

        System.out.println("Have a good Day!");

    }
}
