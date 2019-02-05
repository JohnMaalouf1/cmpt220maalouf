import java.util.Scanner;

public class lab1_4 {

    public static void main(String[] args){

        System.out.println("Hello User, This programs calculates Energy");

        Scanner input = new Scanner(System.in);
        // Declared Variable C
        double c = 299972458;
        System.out.print("Please Enter the mass in Kilograms: ");
        // Assigning Variable m as user input with a double
        double m = input.nextDouble();
        // Declared Variable E as the final equation
        double E = m * Math.pow(c,2);
        // Math.pow raises the Variable c to the second power)

        System.out.println("The Energy output is: "+E);

        System.out.println("Have a good Day!");

    }
}
