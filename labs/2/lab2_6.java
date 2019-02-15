import java.util.Random;

public class lab2_6 {


    // Main Method
    public static void main(String []args){
        Random rand = new Random();
        // Random Class

            // 10 number Variables
            // First one is bound at 8 and then has an addition of 2 to eliminate 0 or 1
            int num1 = rand.nextInt(8) + 2;
            int num2 = rand.nextInt(10);
            int num3 = rand.nextInt(10);
            int num4 = rand.nextInt(10);
            int num5 = rand.nextInt(10);
            int num6 = rand.nextInt(10);
            int num7 = rand.nextInt(10);
            int num8 = rand.nextInt(10);
            int num9 = rand.nextInt(10);
            int num10 = rand.nextInt(10);
            // Print statement
            System.out.println("(" + num1 + "" + num2 + "" + num3 + ")" + num4 + "" + num5 + "" + num6 + "-" + num7 + ""
                    + num8 + "" + num9 + "" + num10);

    }
}
