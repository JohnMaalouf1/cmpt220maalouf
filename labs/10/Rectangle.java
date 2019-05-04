package lab10;

public class Rectangle implements Printable{


    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void print() {
        System.out.println("Rectangle width: " + width + " Rectangle length: " + length);
    }
}
