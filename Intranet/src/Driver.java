import java.util.Scanner;

public class Driver {


    public static Scanner reader = new Scanner(System.in);
    public static Database d = new Database();
    public static void main(String [] args){
        Database.deserialize();
        Start();
        Database.serialize();
    }

    private static void Start() {
        System.out.println("Welcome to University System!!!");
        preLogin();
    }

    private static void preLogin() {
        System.out.println("Authorization");
        System.out.print("LOGIN:__");
        String log = reader.nextLine();
        System.out.print("Password:__");
        String pass = reader.nextLine();

        for (int i = 0; i < Database.getTeachers().size(); i++)
            if (pass.equals(Database.getTeachers().elementAt(i).getPassword()) && log.equals(Database.getTeachers().elementAt(i).getUsername())) {
                TeacherDriver.menu(Database.getTeachers().elementAt(i));
                preLogin();
                return;
            }

        for (int i = 0; i < Database.admins.size(); i++)
            if (pass.equals(Database.admins.elementAt(i).getPassword()) && log.equals(Database.admins.elementAt(i).getUsername())){
                AdminDriver.menu(Database.admins.elementAt(i));
                preLogin();
                return;
            }
        for(int i = 0; i < Database.managers.size(); i++)
            if(pass.equals(Database.managers.elementAt(i).getPassword()) && log.equals(Database.managers.elementAt(i).getUsername())){
                ManagerDriver.menu(Database.managers.elementAt(i));
                preLogin();
                return;
            }
        for(int i = 0; i < Database.students.size(); i++)
            if(pass.equals(Database.students.elementAt(i).getPassword()) && log.equals(Database.students.elementAt(i).getUsername())){
                StudentDriver.menu(Database.students.elementAt(i));
                preLogin();
                return;
            }
        System.out.println("Bad password or login!! Try again!!");
        preLogin();

    }
}
