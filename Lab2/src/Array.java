import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Array {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        while(sc.hasNextInt()){
            a.add(sc.nextInt());
        }
        Integer[] b = {};
        b = a.toArray(new Integer[a.size()]);
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " " + b[i] + " ");
        }
    }
}
