import javax.xml.crypto.Data;

public class Student {

    int id;
    String name;
    int yearOfStudy;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

    int getYearOfStudy(){
        return yearOfStudy;
    }

}
