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
    private static Vector<Course> courses;


    public Database(){
        students = new Vector<>();
        teachers = new Vector<>();
        executors = new Vector<>();
        admins = new Vector<>();
        managers = new Vector<>();
        orders = new Vector<>();
        donedOrders = new Vector<>();
        courses = new Vector<>();
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


    static Vector<Admin> getAdmins() { return admins; }
    public static void setAdmins(Vector<Admin> admins) { Database.admins = admins; }

    static Vector<Executor> getExecutors() { return executors; }
    public static void setExecutors(Vector<Executor> executors) { Database.executors = executors; }

    static Vector<Student> getStudents() { return students; }
    public static void setStudents(Vector<Student> students) { Database.students = students; }

    static Vector<Teacher> getTeachers() { return teachers; }
    public static void setTeachers(Vector<Teacher> teachers) { Database.teachers = teachers; }

    public static Vector<Manager> getManagers() { return managers; }
    public static void setManagers(Vector<Manager> managers) { Database.managers = managers; }

    static Vector<Order> getDonedOrders() { return donedOrders; }
    public static void setDonedOrders(Vector<Order> donedOrders) { Database.donedOrders = donedOrders; }

    static Vector<Order> getOrders() { return orders; }
    public static void setOrders(Vector<Order> orders) { Database.orders = orders; }

    public static Vector<Course> getCourses() { return courses; }
    public static void setCourses(Vector<Course> courses) { Database.courses = courses; }

    @Override
    public String toString() {
        return "Number of: \n" + this.getClass()  + ";"
                + "; orders - " + orders.size()
                + "; doned orders - " + donedOrders.size();
    }
}
