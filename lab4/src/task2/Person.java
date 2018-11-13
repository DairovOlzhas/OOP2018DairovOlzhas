package task2;

abstract class Person implements ComingOfAge{

    String firstname, lastname;

    String getName(){return firstname;}

    @Override
    public void printMyAge(int age) {
        System.out.println("My age is " + age);
    }

    public abstract String toString();
}
