import java.util.Scanner;

public class E {



    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int k = 0;

        for(int i = 1; i < a; i*=2)
            k++;

        System.out.println(k);
    }
}
