package lab7;

public class CourseDriver {

    public static void main(String[] args) {
        Course course = new Course("Software Development 1");
        course.addStudent("Jack");
        course.addStudent("John");
        course.addStudent("Jacob");
        // Adds students
        course.dropStudent("Jacob");
        // Removes student by name
        System.out.println("Students in the course are");
        for(int i = 0; i < course.getNumberOfStudents(); ++i) {
            System.out.println(course.getStudents()[i]);
        }
        // For loop that print students
    }
}
