import java.nio.file.FileSystemLoopException;

public class Test {

    public static void main(String [] args){

        Manager m = new Manager("Olzhas", "Dairov", 60000, 2018, "2152");

        Employee e1 = new Employee("Mask", "Elon", 40000, 2016, "000425");
        Employee e2 = new Employee("Jone", "Mask", 5000, 2017, "88888");

        m.addEmployeeToTeam(e2);
        m.addEmployeeToTeam(e1);
        m.addEmployeeToTeam(new Employee("Li", "Chan", 8000, 2013, "9000"));

        System.out.println(m.toString() + "                 #1 TEST \n \n ");

        System.out.println(e1.toString() + "                #2 TEST \n \n ");

        System.out.print(e1.equals(e2) + "                  #3 TEST \n \n");

        Employee e3 = new Employee("Jone", "Mask", 5000, 2017, "88888");
        Employee e4 = new Employee("Jone", "Mask", 5000, 2017, "88888");
        System.out.print(e4.equals(e3) + "                  #4 TEST \n \n");

        Manager m1 = new Manager("Olzhas", "Dairov", 60000, 2018, "2152");

        m1.addEmployeeToTeam(e2);
        m1.addEmployeeToTeam(e1);
        m1.addEmployeeToTeam(new Employee("Li", "Chan", 8000, 2013, "9000"));

        Person p = new Person();
              System.out.println(p.toString());

  //      System.out.println(m1.toString());
//        System.out.println(m.toString());
        System.out.print(m1.equals(m) + "                  #5 TEST \n \n");
    }
}
