
public class lab4_1 {
    public static void main(String[] args) {

        // Prints out formatting text
        System.out.println("in\t\tcm   | cm\t\tin");
        System.out.println("-------------------------------");

        //Declared Variable
        double cm = 2.54;
        double inch = 0.39;
        int x = 1;

        // For loop that increments cm and inches by their respective values over a course of 50 times
        for (int i = 1; i <= 50; i++) {
            System.out.println((i) + "      " + String.format( "%.2f", cm * i ) + " | " + (x) + "     " + String.format( "%.2f", x*inch));
        x = x+5;
        }
    }
}
