package lab6;


public class Square {
    double width;

    public Square(){
        this.width = 1;
    }

    public Square(double width){
        this.width = width;
    }

    /*public double getWidth(){
        this.width = width;
        return width;
    }
    */

    public double getArea(){
        return width * width;
    }

    public double getPerimeter(){
        return 4 * width;
    }
/*
    public String toString(){
        return "Width: " + getWidth();
    }
    */
}
