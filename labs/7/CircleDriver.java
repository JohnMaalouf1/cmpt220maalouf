package lab7;

public class CircleDriver {
    public static void main(String[] args){
        Circle circle1 = new Circle(2,2,5.5);
        Circle circle2 = new Circle(4,5,10.5);
        Circle circle3 = new Circle(3,5,2.3);
        // Circle methods created with parameter

        System.out.println("The area of the Circle is " + circle1.getArea());
        System.out.println("The perimeter of the Circle is " + circle1.getPerimeter());
        System.out.println("The point 3,3 " + circle1.contains(3,3));
        System.out.println("Circle 1 contains " + circle1.contains(circle2));
        System.out.println("Circle 1 overlaps with circle 3 " + circle1.overlaps(circle3));
        // Print statements

    }
}
