import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Vector;

public class Database {
    static Vector<Student> students;
    static Vector<Teacher> teachers;
    static Vector<Admin> admins;
    static Vector<Executor> executors;
    static Vector<Manager> managers;
    static Vector<Order> orders;
    static Vector<Order> donedOrders;


    public Database(){
        students = new Vector<>();
        teachers = new Vector<>();
        executors = new Vector<>();
        admins = new Vector<>();
        managers = new Vector<>();
        orders = new Vector<>();
        donedOrders = new Vector<>();
    }

    void remStudent(Student student){
        Database.students.removeElement(student);
        for(int i = 0; i < Manager.getCourses().size(); i++)
            Manager.getCourses().elementAt(i).remStudent(student);
    }


    void remTeacher(Teacher teacher) {
        Database.teachers.removeElement(teacher);
        for (int i = 0; i < Manager.getCourses().size(); i++)
            Manager.getCourses().elementAt(i).setTeacher(null);
    }
    @Override
    public String toString() {
        return "Number of: \n" + this.getClass()  + ";"
                + "; orders - " + orders.size()
                + "; doned orders - " + donedOrders.size();
    }
}
