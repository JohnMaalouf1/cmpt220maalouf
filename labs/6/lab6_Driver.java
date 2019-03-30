package lab6;

public class lab6_Driver {

    public static void main(String[] args){
        Square square1 = new Square(40);
        Square square2 = new Square(35.9);
        Bond bond1 = new Bond(500,100, 0.05, 10000);

        System.out.println("Width: " + square1.width + " Area: " + square1.getArea() + " Perimeter: " + square1.getPerimeter());
        System.out.println("Width: " + square2.width + " Area: " + square2.getArea() + " Perimeter: " + square2.getPerimeter());
        System.out.println(bond1.getPrice());

    }
}
