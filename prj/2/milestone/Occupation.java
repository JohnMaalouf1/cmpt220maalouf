package AdressBook;

public class  Occupation {

    private String job;
    private int salary;
    private int hoursPerWeek;

    // constructor
    public Occupation( String work, int pay, int hours)
    {
        job = work;
        salary = pay;
        hoursPerWeek = hours;
    }

    // methods
    public String getJob()
    {
        return job;
    }

    public int getSalary()
    {
        return salary;
    }

    public int getHoursPerWeek()
    {
        return hoursPerWeek;
    }


    public String export(){
        return getJob() + "\n" + getSalary() + "\n" + getHoursPerWeek();
    }

    public String toString()
    {
        return "Job: " + getJob() + "\nYearly Salary: " + getSalary() + "\nHours: " + getHoursPerWeek() ;
    }
}
