import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Analyzer {
    public static void main(String [] args){
        Data set = new Data();
        String input = "";
        Scanner sc = new Scanner(System.in);
        while(input != "Q"){
            System.out.print("Enter number (Q to quit): ");
            input = sc.next();
            try{
                set.add(Double.parseDouble(input));
            }catch( Exception e){
                break;
            }
        }
        System.out.printf("Average = %.1f\nMaximum = %.1f", set.average(), set.max());
    }
}
