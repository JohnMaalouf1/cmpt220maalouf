package lab7;
import java.util.Scanner;

class StackOfIntegersDriver {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int userInput = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers();

        if (StackOfIntegers.findFactors(userInput)[0] == -1) {
        } else {
            do {
                stack.push(StackOfIntegers.findFactors(userInput)[1]);
                userInput = StackOfIntegers.findFactors(userInput)[0];
            } while (StackOfIntegers.findFactors(userInput)[0] != -1);
        }
        stack.push(StackOfIntegers.findFactors(userInput)[1]);

        while (!stack.empty())
            System.out.print(stack.pop());
        input.close();

    }
}