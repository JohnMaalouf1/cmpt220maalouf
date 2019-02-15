import java.util.Scanner;

public class lab2_2 {
    // Main Method
    public static void main(String[] args){
        // Scanner Class
        Scanner input = new Scanner(System.in);

        // Takes in int input
        System.out.print("Hello User! Please Enter the Number of the month you would like to be printed: ");
        int month = input.nextInt();
        // If/ Else if / Else chain with print statements
        if (month == 1){
            System.out.println("January");
        } else if(month == 2){
            System.out.println("February");
        } else if(month == 3){
            System.out.println("March");
        } else if(month == 4){
            System.out.println("April");
        } else if (month == 5){
            System.out.println("May");
        } else if (month == 6){
            System.out.println("June");
        }else if (month == 7) {
            System.out.println("July");
        }else if (month == 8) {
            System.out.println("August");
        }else if (month == 9) {
            System.out.println("September");
        }else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        }else if (month == 12) {
            System.out.println("December");
        } else {
            System.out.println("Please enter an Integer corresponding to the Months 1-12");
        }

    }
}
