package lab10;

public class Driver {

    public static void main(String[] args){

        FirstSubClass FirstClass = new FirstSubClass();
        FirstClass.printMessage("This is first subclass");

        SecondSubClass SecondClass = new SecondSubClass();
        SecondClass.printMessage("This is second subclass");
    }
}
