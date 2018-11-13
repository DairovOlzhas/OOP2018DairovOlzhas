package task3;

import java.util.Date;

public class Manager extends Employee {

    private Employee[] teamOfEmployees;
    private int empNumb = 0;
    protected double bonus;

    public Manager() {
        super();
        teamOfEmployees = new Employee[1000];
        bonus = 0;
    }

    public Manager(String fn, String ln, double s, Date y, String inN) {
        super(fn, ln, s, y, inN);
        teamOfEmployees = new Employee[1000];
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public Employee[] getTeamOfEmployees() {
        return teamOfEmployees;
    }

    public Manager(Employee[] employees) {
        teamOfEmployees = employees;
    }

    public void addEmployeeToTeam(Employee e) {
        teamOfEmployees[empNumb] = e;
        empNumb++;
        bonus = empNumb * 1000;
    }

    @Override
    public String toString() {
        String Employees = "Team of Employees: \n";
        for (int i = 0; i < empNumb; i++) {
            Employees += teamOfEmployees[i].toString() + "\n";
        }
        return super.toString() + " " + bonus + " " + Employees;
    }

    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof Manager)) return false;
        Manager m = (Manager) o;

        for (int i = 0; i < empNumb; i++) {
            if (!m.teamOfEmployees[i].equals(this.teamOfEmployees[i]))
                return false;
        }
        return  (m.bonus == this.bonus && super.equals(m));
    }




    @Override
    public int compareTo(Object o) {
        if(o instanceof Manager){

            Manager m = (Manager) o;
            if(m.getSalary() > this.getSalary())
                return -1;
            else if(m.getSalary() < this.getSalary())
                return 1;
            else if(m.getBonus() > this.getBonus())
                return -1;
            else if(m.getBonus() < this.getBonus())
                return 1;
            return 0;
        }
        return 0;
    }
}

