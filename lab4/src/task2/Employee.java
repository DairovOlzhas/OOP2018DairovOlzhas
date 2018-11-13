package task2;

import java.util.EnumMap;

public class Employee extends Person implements Comparable, ComingOfAge {

    int salary;


    @Override
    public String toString() {
        return "Employee";
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee e = (Employee) o;
            if(e.salary > this.salary) return -1;
            else if(e.salary < this.salary) return 1;
            return 0;
        }
        return 0;
    }
}
