
import lab8.GeometricObject;

class Triangle extends GeometricObject{
     double side1;
     double side2;
     double side3;

    public Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    public Triangle(double side1A, double side2A, double side3A) throws IllegalTriangleException{
        side1 = side1A;
        side2 = side2A;
        side3 = side3A;

        if (side1 + side2 < side3){
            throw new IllegalTriangleException("The sum of two sides cannot be smaller than the third size! ");
        } else if (side2 + side3 < side1){
            throw new IllegalTriangleException("The sum of two sides cannot be smaller than the third size! ");
        } else if (side1 + side3 < side2){
            throw new IllegalTriangleException("The sum of two sides cannot be smaller than the third size! ");
        }
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    public double getArea() {
        double sides = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3));
        return area;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String toString( )
    {
        return "Triangle: Side1 = " + side1 + " Side 2 = " + side2 + " side3 = " + side3;
    }

}

