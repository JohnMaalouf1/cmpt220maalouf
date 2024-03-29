package lab8;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private static ArrayList<String> students = new ArrayList<String>();
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudent(String student)
    {
        students.add(student);
    }

    public String getCourseName()
    {
        return courseName;
    }

    public ArrayList<String> getStudents()
    {
        return students;
    }

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public void dropStudent(String student)
    {
        students.remove(student);
    }

}
