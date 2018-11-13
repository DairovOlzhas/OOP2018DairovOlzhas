package task3;

public class Person {

    private String firstname, lastname;

    public Person(){
        firstname = "none";
        lastname = "none";
    }


    public Person(String fn, String ln){
        firstname = fn;
        lastname = ln;
    }

    public void setFirstName(String fn)
    {
        firstname = fn;
    }

    public void setLastName(String ln){
        lastname = ln;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }


   /* @Override
    public String toString() {
        return lastname + " " + firstname;
    }*/

    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof Person)) return false;
        Person p = (Person) o;
        System.out.println("task3.Person equals method");
        return p.lastname == this.lastname && p.firstname == this.firstname;
    }
}
