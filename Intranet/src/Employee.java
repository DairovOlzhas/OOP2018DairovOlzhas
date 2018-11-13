import java.util.ArrayList;
import java.util.HashMap;

public abstract class Employee{
    int salary = 0;
    HashMap<Manager, String> messages;


    abstract void setSalary(int salary);
    abstract void sendOrder(Order order);
    int getSalary(){ return salary; }

}
