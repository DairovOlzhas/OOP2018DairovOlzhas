package task3;

public class Test {
    public static void main(String args[]){

        Person persons[] = new Person[10];
        Person clonedPersons[] = new Person[10];
        persons[0] = new Employee();
        persons[1] = new Manager();


        for(int i = 0; i < 10; i++){
            if(persons[i] instanceof Cloneable){
                clonedPersons[i] = persons[i].clone();
            }
        }
    }
}
