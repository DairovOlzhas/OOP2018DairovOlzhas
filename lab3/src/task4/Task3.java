package task4;

public class Task3 {
    public static void main(String [] args){
        // example #1
        StudentTask3 studentObject = new StudentTask3();
        EmployeeTask3 employeeObject = new EmployeeTask3();
        PersonTask3 ref = studentObject; //task3.Person ref. points to a

        String name = ref.getName();
        String temp= ref.getName();
        System.out.println( temp );

        ref = employeeObject;

        temp = ref.getName();
        System.out.println( temp );

        // example #2


        PersonTask3.printInformation(studentObject);
        PersonTask3.printInformation(employeeObject);


    }
}
