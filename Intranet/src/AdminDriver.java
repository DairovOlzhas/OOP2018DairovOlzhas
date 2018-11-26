import java.io.*;
import java.util.Date;
import java.util.Vector;

public class AdminDriver {

    private static Admin adm;

    public static void menu(Admin admin) {
        adm = admin;
        System.out.println("------ADMIN MENU------");
        System.out.println("Welcome " + admin.getFirstname() + "!!");
        System.out.println();
        System.out.println("Choose action( q - to quit):");
        System.out.println("1) Add User");
        System.out.println("2) Remove User");
        System.out.println("3) Update User");

        System.out.println("3) Update Teacher");
        System.out.println("6) Update Student");
        System.out.println("9) Update Manager");
        System.out.println("12) Update Admin");
        System.out.println("13)View list of Users");

        System.out.print("__");
        String com = Driver.reader.nextLine();

        switch (com){
            case "1":
                addUser();
                break;
            case "2":
                remUser();
                break;
            case "3":
                updUser();
                break;
            case "4":
                //viewList();
                break;
        }

    }

    private static void updUser() {
    }

    private static void remUser() {
        System.out.println("Removing User(b - to back):");
        System.out.println("1) Remove Teacher");
        System.out.println("2) Remove Student");
        System.out.println("3) Remove Admin");
        System.out.println("4) Remove Manager");
        System.out.println("5) Remove Executor");

        System.out.print("__");
        String in = Driver.reader.nextLine();

        switch (in){
            case "1":
                remTeacher();
                break;
            case "2":
                remStudent();
                break;
            case "3":
                remAdmin();
                break;
            case "4":
                remManager();
                break;
            case"5":
                remExecutor();
                break;
            case "b":
                menu(adm);
                return;
            default:
                break;
        }


    }

    private static void remExecutor() {
        System.out.println("Choose Executor for removing(b - to back):");
        System.out.println();
        Vector<Executor> es = Database.getExecutors();
        for(int i = 0; i < es.size(); i++){
            Executor e = es.elementAt(i);
            System.out.println( (i+1) + ") " + e.getLastname() + " " + e.getFirstname());
        }
        System.out.print("__");
        String in = Driver.reader.nextLine();
        if(in.equals("b")){
            remUser();
            return;
        }
        for(int i = 0; i < in.length(); i++) if(!Character.isDigit(in.charAt(i))){ remExecutor(); return;}
        int n = Integer.parseInt(in);
        if(n > 0 && n <= es.size()){
            Executor e = es.elementAt(n-1);
            Database.remExecutor(e);
            System.out.println("Executor removed");
            logger(e, "removed");
        }else
            remManager();
    }

    private static void remManager() {
        System.out.println("Choose Manager for removing(b - to back):");
        System.out.println();
        for(int i = 0; i < Database.getManagers().size(); i++){
            Manager m = Database.getManagers().elementAt(i);
            System.out.println( (i+1) + ") " + m.getLastname() + " " + m.getFirstname());
        }
        System.out.print("__");
        String in = Driver.reader.nextLine();
        if(in.equals("b")){
            remUser();
            return;
        }
        for(int i = 0; i < in.length(); i++) if(!Character.isDigit(in.charAt(i))){ remManager(); return;}
        int n = Integer.parseInt(in);
        if(n > 0 && n <= Database.getManagers().size()){
            Manager m = Database.getManagers().elementAt(n-1);
            Database.remManager(m);
            System.out.println("Student removed");
            logger(m, "removed");
        }else
            remManager();
    }

    private static void remAdmin() {

        System.out.println("Choose Admin for removing(b - to back):");
        System.out.println();
        for(int i = 0; i < Database.getAdmins().size(); i++){
            Admin a = Database.getAdmins().elementAt(i);
            System.out.println( (i+1) + ") " + a.getLastname() + " " + a.getFirstname());
        }
        System.out.print("__");
        String in = Driver.reader.nextLine();
        if(in.equals("b")){
            remUser();
            return;
        }
        for(int i = 0; i < in.length(); i++) if(!Character.isDigit(in.charAt(i))){ remAdmin(); return;}
        int n = Integer.parseInt(in);
        if(n > 0 && n <= Database.getAdmins().size()){
            Admin a = Database.getAdmins().elementAt(n-1);
            Database.remAdmin(a);
            System.out.println("Admin removed");
            logger(a, "removed");
        }else
            remAdmin();
    }

    private static void remStudent() {
        System.out.println("Choose Student for removing(b - to back):");
        System.out.println();
        for(int i = 0; i < Database.getStudents().size(); i++){
            Student s = Database.getStudents().elementAt(i);
            System.out.println( (i+1) + ") " + s.getLastname() + " " + s.getFirstname());
        }
        System.out.print("__");
        String in = Driver.reader.nextLine();
        if(in.equals("b")){
            remUser();
            return;
        }
        for(int i = 0; i < in.length(); i++) if(!Character.isDigit(in.charAt(i))){ remStudent(); return;}
        int n = Integer.parseInt(in);
        if(n > 0 && n <= Database.getStudents().size()){
            Student s =  Database.getStudents().elementAt(n-1);
            Database.remStudent(s);
            System.out.println("Student removed");
            logger(s, "removed");
        }else
            remStudent();
    }

    private static void remTeacher() {
        System.out.println("Choose Teacher for removing(b - to back):");
        System.out.println();
        for(int i = 0; i < Database.getTeachers().size(); i++){
            Teacher t = Database.getTeachers().elementAt(i);
            System.out.println( (i+1) + ") " + t.getLastname() + " " + t.getFirstname());
        }
        System.out.print("__");
        String in = Driver.reader.nextLine();
        if(in.equals("b")){
            remUser();
            return;
        }
        for(int i = 0; i < in.length(); i++) if(!Character.isDigit(in.charAt(i))){ remTeacher(); return;}
        int n = Integer.parseInt(in);
        if(n > 0 && n <= Database.getTeachers().size()){
            Teacher t = Database.getTeachers().elementAt(n-1);
            Database.remTeacher(t);
            System.out.println("Teacher removed");
            logger(t, "removed");
        }else
            remTeacher();
    }

    private static void addUser() {
        System.out.println("Adding User(b - to back):");
        System.out.println("1) Add Teacher");
        System.out.println("2) Add Student");
        System.out.println("3) Add Admin");
        System.out.println("4) Add Manager");
        System.out.println("5) Add Executor");

        System.out.print("__");
        String in = Driver.reader.nextLine();

        System.out.print("ID:__");
        String id = Driver.reader.nextLine();
        System.out.print("First Name:__");
        String firstname = Driver.reader.nextLine();
        System.out.print("Last Name:__");
        String lastname = Driver.reader.nextLine();
        System.out.print("Gender: 1) FEMALE;  2) MALE   \n__");
        String gend = Driver.reader.nextLine();
        Gender gender = (gend.equals("1")) ? Gender.FEMALE : Gender.MALE;
        System.out.print("Email:__");
        String email = Driver.reader.nextLine();
        System.out.print("Tel. Number:__");
        String telNumb = Driver.reader.nextLine();

        switch (in){
            case "1":
                addTeacher(id, gender, firstname, lastname, telNumb, email);
                break;
            case "2":
                addStudent(id, gender, firstname, lastname, telNumb, email);
                break;
            case "3":
                addAdmin(id, gender, firstname, lastname, telNumb, email);
                break;
            case "4":
                addManager(id, gender, firstname, lastname, telNumb, email);
                break;
            case "5":
                addExecutor(id, gender, firstname, lastname, telNumb, email);
            case "b":
                menu(adm);
                return;
            default:
                break;
        }

    }

    private static void addExecutor(String id, Gender gender, String firstname, String lastname, String telNumb, String email) {
        System.out.print("Salary :__");
        int salary = Integer.parseInt(Driver.reader.nextLine());
        Executor e = new Executor(id, gender, lastname, firstname, telNumb, email,  salary);
        Database.addExecutor(e);
        System.out.println("Executor added successfully!!");
        logger(e, "added");
        menu(adm);
    }

    private static void addManager(String id, Gender gender, String firstname, String lastname, String telNumb, String email) {
        System.out.print("Salary :__");
        int salary = Integer.parseInt(Driver.reader.nextLine());
        Manager m = new Manager(id, gender, lastname, firstname, telNumb, email,  salary);
        Database.addManager(m);
        System.out.println("Manager added successfully!!");
        logger(m, "added");
        menu(adm);
    }

    private static void addAdmin(String id, Gender gender,String firstname, String lastname, String telNumb,String email) {
        System.out.print("Salary :__");
        int salary = Integer.parseInt(Driver.reader.nextLine());
        Admin a = new Admin(id, gender, lastname, firstname, telNumb, email,  salary);
        Database.addAdmin(a);
        System.out.println("Admin added successfully!!");
        logger(a, "added");
        menu(adm);
    }

    private static void addStudent(String id, Gender gender,String firstname, String lastname, String telNumb,String email) {

        System.out.print("Faculty:__");
        String faculty = Driver.reader.nextLine();
        System.out.print("Specialization:__");
        String specialization = Driver.reader.nextLine();
        System.out.print("Year of study:__");
        int year = Integer.parseInt(Driver.reader.nextLine());
        System.out.print("Degree: \n1) Bachelor\n 2)Magistr\n__");
        Degree degree = (Driver.reader.nextLine().equals("1")) ? Degree.BACHULAR : Degree.MAGISTRANT;
        Student s = new Student(id, gender, lastname, firstname, telNumb, email, faculty, specialization, year, degree);
        Database.addStudent(s);
        System.out.println("Student added successfully!!");
        logger(s, "added");
        menu(adm);
    }

    private static void addTeacher(String id, Gender gender,String firstname, String lastname, String telNumb,String email) {

        System.out.print("Position: \n 1) TUTOR\n2) LECTOR\n3) ASSISTANT\n4) PROFESSOR\n__");
        Position position = Position.values()[Integer.parseInt(Driver.reader.nextLine()) - 1];
        System.out.print("Salary :__");
        int salary = Integer.parseInt(Driver.reader.nextLine());
        Teacher t = new Teacher(id, gender, lastname, firstname, email, telNumb, salary, position);
        Database.addTeacher(t);
        System.out.println("Teacher added successfully!!");
        logger(t, "added");
        menu(adm);
    }

    public static void logger(Object obj, String action) {
        try{
            BufferedWriter bw =  new BufferedWriter(new PrintWriter(new FileWriter(new File("D:\\III Semestr\\OOP\\Intranet\\admin.txt"), true)));
            bw.write(new Date() + " Admin " + adm.getUsername() + " " + action + " " + obj.getClass().getName() + " " + obj.toString()+"\n");
            bw.close();
        }catch (IOException e){
            System.out.println("File can't read [logger]");
        }
    }
}
