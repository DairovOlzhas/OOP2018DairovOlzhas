package task3;

public class Employee extends Person {

    private double salary;
    private int year;
    private String insuranceNumber;

    public Employee(){
        super();
        salary = 0;
        year = 2018;
        insuranceNumber = "001";
    }

    public Employee(String fn, String ln, double s, int y, String inN){
        super(fn, ln);
        salary = s;
        year = y;
        insuranceNumber = inN;
    }

    public void setSalary(double s){
        salary = s;
    }
    public void setYear(int y){
        year = y;
    }
    public void setInsuranceNumber(String inN){
        insuranceNumber = inN;
    }

    public double getSalary(){
        return salary;
    }
    public int getYear(){
        return year;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " " + salary + " " + year;
    }

    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof Employee)) return false;
        Employee e = (Employee) o;

        System.out.println("task3.Employee equals method");

        return (e.insuranceNumber == this.insuranceNumber && e.year == this.year && e.salary == this.salary && super.equals(e));
    }
}
