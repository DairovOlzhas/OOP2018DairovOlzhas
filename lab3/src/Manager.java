public class Manager extends Employee {

    private Employee[] teamOfEmployees;
    private int empNumb = 0;
    protected double bonus;

    public Manager() {
        super();
        teamOfEmployees = new Employee[1000];
        bonus = 0;
    }

    public Manager(String fn, String ln, double s, int y, String inN) {
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

    public boolean equals(Manager m) {

        Employee e = m;

        for (int i = 0; i < empNumb; i++) {
            if (!m.teamOfEmployees[i].equals(this.teamOfEmployees[i]))
                return false;
        }
        if (m.bonus == this.bonus && super.equals(e))
            return true;
        return false;
    }
}

