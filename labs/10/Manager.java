package lab10;

public class Manager extends Employee {
    public Manager(String name, int age, int hourRate) {
        
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    @Override
    public double salary(double hours) {
        return this.hourRate * hours;
    }
}
