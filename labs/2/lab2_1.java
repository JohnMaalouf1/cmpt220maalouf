import java.util.Scanner;
// Main Method
public class lab2_1 {
    public static void main(String[] args){
        // Scanner Class
        Scanner input = new Scanner(System.in);

        // Taking in Variables
        System.out.print("Please Enter the FIRST Number: ");
        int number1 = input.nextInt();
        System.out.print("Please Enter the SECOND Number: ");
        int number2 = input.nextInt();

        // Boolean Equalities
        boolean result1 = number1 < number2;
        boolean result2 = number1 <= number2;
        boolean result3 = number1 == number2;
        boolean result4 = number1 != number2;
        boolean result5 = number1 > number2;
        boolean result6 = number1 >= number2;

        // Print Statements
        System.out.println(number1+" LESS THAN " + number2 +"? "+ result1);
        System.out.println(number1+" LESS THAN OR EQUAL TO " + number2 +"? "+ result2);
        System.out.println(number1+" EQUAL TO " + number2 +"? "+ result3);
        System.out.println(number1+" NOT EQUAL TO " + number2 +"? "+ result4);
        System.out.println(number1+" GREATER THAN " + number2 +"? "+ result5);
        System.out.println(number1+" GREATER THAN OR EQUAL TO " + number2 +"? "+ result6);
        
    }
}
