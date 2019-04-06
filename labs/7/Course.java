package lab7;

public class Course {
    private String courseName;
    private String[] students = new String[30];
    private int numberOfStudents;
    // Class Variables

    public Course(String courseName) {
        this.courseName = courseName;
        // Overloaded constructor
    }

    public void clearStudents() {
        //Clears Student
        numberOfStudents = 0;
    }

    public void addStudent(String student) {
        // Add student method
        if(numberOfStudents == students.length) {
            String[] copy = new String[students.length + 5];
            // makes new array of 5 places bigger
            for(int i = 0; i < students.length; ++i) {
                copy[i] = students[i];
            }
            students = copy;
        }
        students[numberOfStudents++] = student;
        // Fills array
    }
    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i + 1; j < numberOfStudents; j++)
                    students[j - 1] = students[j];
                numberOfStudents--;
                return;
            }
        }
    }
}

