import static java.sql.Types.NULL;

public class Data {

    private int count;
    private double summ;
    private double maximum;

    public Data(){
        count = 0;
    }

    public void add(double input){
        summ += input;
        if(count==0 || input > maximum)
            maximum = input;

        count++;
    }

    public double average(){
        if(count!=0)
            return summ/count;
        return 0;
    }
    public double max(){
        return maximum;
    }

}
