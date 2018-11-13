import java.util.ArrayList;
import java.util.HashMap;

public class Teacher extends Employee{

    ArrayList<Course> courses;
    HashMap<Course, ArrayList<Student>> students;
    HashMap<Course, Integer> paymentsPerCourse;

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
