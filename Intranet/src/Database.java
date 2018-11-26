import javax.print.attribute.standard.OrientationRequested;
import javax.xml.crypto.Data;
import javax.xml.datatype.DatatypeConfigurationException;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class Database implements Serializable {
    private static Vector<Student> students;
    private static Vector<Teacher> teachers;
    private static Vector<Admin> admins;
    private static Vector<Executor> executors;
    private static Vector<Manager> managers;
    private static Vector<Order> orders;
    private static Vector<Order> donedOrders;


    public Database(){
        students = new Vector<>();
        teachers = new Vector<>();
        executors = new Vector<>();
        admins = new Vector<>();
        managers = new Vector<>();
        orders = new Vector<>();
        donedOrders = new Vector<>();
    }



    public static void serialize() {
        try {
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("Database.out"));
            ois.writeObject(Driver.d);
            ois.close();
        }catch (FileNotFoundException fn){

        }catch (IOException io){

        }

    }

    public static void deserialize() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Database.out"));
            Driver.d = (Database)ois.readObject();
            ois.close();
        }catch (FileNotFoundException fn){

        }catch (IOException io){

        }catch (ClassNotFoundException cnfe){

        }
    }

    static void remAdmin(Admin admin){ Database.admins.removeElement(admin); }
    static Vector<Admin> getAdmins() { return admins; }
    static void addAdmin(Admin admin) { admins.addElement(admin); }

    static void remExecutor(Executor executor){ Database.executors.removeElement(executor); }
    static Vector<Executor> getExecutors() { return executors; }
    static void addExecutor(Executor executor) { executors.addElement(executor); }

    static void remStudent(Student student){
        Database.students.removeElement(student);
        for(int i = 0; i < Manager.getCourses().size(); i++)
            Manager.getCourses().elementAt(i).remStudent(student);
    }
    static Vector<Student> getStudents() { return students; }
    static void addStudent(Student student) { students.addElement(student); }

    static void remTeacher(Teacher teacher) {
        Database.teachers.removeElement(teacher);
        for(int i = 0; i < teacher.getCourses().size(); i++){
            teacher.getCourses().elementAt(i).setTeacher(null);
        }
    }
    static Vector<Teacher> getTeachers() { return teachers; }
    static void addTeacher(Teacher teacher) { teachers.addElement(teacher); }

    static void remManager(Manager manager){
        Database.managers.removeElement(manager);
    }
    public static Vector<Manager> getManagers() { return managers; }
    public static void addManager(Manager manager) { managers.addElement(manager); }

    static void remDonedOrder(Order order){ donedOrders.removeElement(order); }
    static Vector<Order> getDonedOrders() { return donedOrders; }
    static void addDonedOrder(Order order) { donedOrders.addElement(order); }

    static void remOrder(Order order){ orders.removeElement(order); }
    static Vector<Order> getOrders() { return orders; }
    static void addOrder(Order order) { orders.addElement(order); }


    @Override
    public String toString() {
        return "Number of: \n" + this.getClass()  + ";"
                + "; orders - " + orders.size()
                + "; doned orders - " + donedOrders.size();
    }
}
