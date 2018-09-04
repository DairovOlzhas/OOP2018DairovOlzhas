import java.util.Scanner;

public class B {

    static double power(double a, int n){
        double res = 1;
        for(int i = 0; i < n; i++)
            res *= a;

        return res;
    }
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print(power(Double.parseDouble(scan.next()),Integer.parseInt(scan.next())));
    }
}
