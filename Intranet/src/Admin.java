import javax.xml.crypto.Data;
import java.util.Vector;

public class Admin extends Employee {
    public Admin(String id, Gender gender, String lastname, String firstname, String telNumber, String email, int salary){
        super(id, gender, lastname, firstname, telNumber, email, salary);
    }

    static void remAdmin(Admin admin){
        Vector<Admin> admins = Database.getAdmins();
        admins.removeElement(admin);
        Database.setAdmins(admins);
    }
    static void addAdmin(Admin admin) {
        Vector<Admin> admins = Database.getAdmins();
        admins.addElement(admin);
        Database.setAdmins(admins);
    }

    static void remExecutor(Executor executor){
        Vector<Executor> executors = Database.getExecutors();
        executors.removeElement(executor);
        Database.setExecutors(executors);
    }
    static void addExecutors(Executor executor) {
        Vector<Executor> executors = Database.getExecutors();
        executors.addElement(executor);
        Database.setExecutors(executors);
    }

    static void remStudent(Student student){
        Vector<Student> students = Database.getStudents();
        students.removeElement(student);
        Database.setStudents(students);

        Vector<Course> courses = Database.getCourses();
        for(int i = 0; i < courses.size(); i++){
            if(courses.elementAt(i).getStudents().removeElement(student)){
                students = courses.elementAt(i).getStudents();
                students.removeElement(student);
                courses.elementAt(i).setStudents(students);
            }
        }
        Database.setCourses(courses);
    }
    static void addStudent(Student student){
        Vector<Student> students = Database.getStudents();
        students.addElement(student);
        Database.setStudents(students);
    }

    static void remTeacher(Teacher teacher){
        Vector<Teacher> teachers = Database.getTeachers();
        teachers.removeElement(teacher);
        Database.setTeachers(teachers);

        Vector<Course> courses = Database.getCourses();
        for(int i = 0; i < courses.size(); i++){
            if(courses.elementAt(i).getTeacher().equals(teacher)){
                courses.elementAt(i).setTeacher(null);
            }
        }
        Database.setCourses(courses);
    }
    static void addTeacher(Teacher teacher){
        Vector<Teacher> teachers = Database.getTeachers();
        teachers.addElement(teacher);
        Database.setTeachers(teachers);
    }

    static void remManager(Manager manager) {
        Vector<Manager> managers = Database.getManagers();
        managers.removeElement(manager);
        Database.setManagers(managers);
    }
    static void addManager(Manager manager) {
        Vector<Manager> managers = Database.getManagers();
        managers.addElement(manager);
        Database.setManagers(managers);
    }


}
