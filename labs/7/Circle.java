package lab7;
// Package Declaration

public class Circle {
    // Class Circle
    double x;
    double y;
    double radius;
    // Variables Declared

    public Circle(){
        // Default Constructor
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle(double x, double y, double radius){
        // Overloaded Constructor
        this.x = x;
        this.y = y;
        this. radius = radius;
    }

    public double getArea(){
        // Get area
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        // Get Perimeter method
        return 2*3.14*radius;
    }

    public double distance(double circleX, double circleY){
        // Gets distance for for the contains and overlaps method
        return Math.sqrt((circleX - x) * (circleX - x) + (circleY - y) + (circleY - y));
    }
    public boolean contains(double circleX, double circleY){
        // Contains method with double parameters
        // Checks to see if point is inside circle
        if(distance(circleX, circleY)<this.radius){
            return true;
        }
        else return false;
    }

    public boolean contains(Circle circle){
        // Contains overloaded with Circle circle
        // Checks to see if circle is inside circle
        if(this.radius<distance(circle.x,circle.y)&&circle.radius>distance(circle.x,circle.y)){
            return true;
        }
        else return false;

    }

    public boolean overlaps(Circle circle){
        // Overlaps method to see if a circles overlaps another circle
        if (distance(circle.x, circle.y) < circle.radius){
            return true;
        }
        else return false;
    }

}
