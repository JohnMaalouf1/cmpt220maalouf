package lab8;
import java.util.Scanner;
public class TriangleDriver{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        String triColor;
        boolean isFilled;
        System.out.println("Enter side 1");
        a=input.nextDouble();
        System.out.println("Enter side 2");
        b=input.nextDouble();
        System.out.println("Enter side 3");
        c=input.nextDouble();
        System.out.println("Please Enter color of Triangle: ");
        triColor=input.next();
        System.out.println("Is triangle filled ?");
        System.out.println("True or False");
        isFilled=input.nextBoolean();

        Triangle triangle1 = new Triangle(a, b, c);
        triangle1.setColor(triColor);
        triangle1.setFilled(isFilled);
        System.out.println(triangle1.toString());
    }
}