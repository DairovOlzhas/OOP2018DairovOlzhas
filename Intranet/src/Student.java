import java.util.ArrayList;
import java.util.HashMap;

public class Student extends User {

    private Degree degree;
    private int yearOfStudy;
    private String faculty;
    private String specialization;
    private ArrayList<Course> takencourses;
    private HashMap<Course, ArrayList<Mark>> marks;


}
