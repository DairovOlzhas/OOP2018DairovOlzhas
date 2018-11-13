package task2;

public class Student extends Person implements ComingOfAge{

    int gpa;

    @Override
    public String toString() {
        return "Student";
    }

    @Override
    public void printMyAge(int age) {
        super.printMyAge(age);
    }
}
