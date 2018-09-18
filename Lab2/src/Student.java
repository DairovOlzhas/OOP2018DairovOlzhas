import javax.xml.crypto.Data;

public class Student {

    int id;
    String name;
    int yearOfStudy;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getYearOfStudy(){
        return yearOfStudy;
    }

}
