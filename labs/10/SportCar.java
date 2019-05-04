package lab10;

public class SportCar implements Printable{

    String name;
    double id;
    public SportCar(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void print() {

        System.out.println("Car Name: " + name + " Car ID: " + id);

    }
}
