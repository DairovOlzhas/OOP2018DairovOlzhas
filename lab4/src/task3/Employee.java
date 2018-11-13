package task3;

import java.util.Date;

public class Employee extends Person implements Comparable{

    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(){
        super();
        salary = 0;
        hireDate = new Date();
        insuranceNumber = "001";
    }

    public Employee(String fn, String ln, double s, Date y, String inN){
        super(fn, ln);
        salary = s;
        hireDate = y;
        insuranceNumber = inN;
    }

    public void setSalary(double s){
        salary = s;
    }
    public void setYear(Date y){
        hireDate = y;
    }
    public void setInsuranceNumber(String inN){
        insuranceNumber = inN;
    }

    public double getSalary(){
        return salary;
    }
    public Date getYear(){
        return hireDate;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " " + salary + " " + hireDate;
    }

    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof Employee)) return false;
        Employee e = (Employee) o;

        System.out.println("task3.Employee equals method");

        return (e.insuranceNumber.equals(this.insuranceNumber) && e.hireDate.equals(this.hireDate) && e.salary == this.salary && super.equals(e));
    }

    public Manager clone(){
        System.out.println("Manager clone");
        return new Manager(getFirstname(), getLastname(), getSalary(), getYear(), getInsuranceNumber());
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){

            Employee e = (Employee) o;
            if(e.getSalary() > this.getSalary())
                return -1;
            else if(e.getSalary() < this.getSalary())
                return 1;
            return 0;
        }
        return 0;
    }
}
