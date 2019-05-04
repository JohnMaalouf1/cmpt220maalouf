package lab10;

public class Manager2 implements Printable{

    String name;
    int id;
    public Manager2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void print() {
        System.out.println("Managers Name: " + name + " Managers id: " + id);
    }
}
