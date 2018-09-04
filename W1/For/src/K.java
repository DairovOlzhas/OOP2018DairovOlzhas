import java.util.Scanner;

public class K {
    public static void main(String [] args){

        int a, sum = 0;

        Scanner scan = new Scanner(System.in);
        a = Integer.parseInt(scan.next());
        for(int i = 0; i < a; i++){
            sum += Integer.parseInt(scan.next());
        }

        System.out.println(sum);
    }

}
