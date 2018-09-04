import java.util.Scanner;

public class J {
    public static void main(String [] args){

        int a, sum = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 100; i++){
            sum += Integer.parseInt(scan.next());
        }

        System.out.println(sum);
    }

}
