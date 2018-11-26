import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public abstract class Employee extends User implements Salariable{
    private int salary;

    Employee(String id, Gender gender, String lastname, String firstname, String telNumber, String email, int salary){
        super(id, gender, lastname, firstname, telNumber, email);
        this.salary = salary;
    }

    public void setSalary(int salary) { this.salary = salary; }

    void sendOrder(Order order){Database.addOrder(order); }

    public int getSalary(){ return salary; }

}
