import java.util.Scanner;

public class A {

    static int min(int a, int b, int c, int d){
        int A, B;

        if(a >= b)
            A = b;
        else
            A = a;

        if(c >= d)
            B = d;
        else
            B = c;

        if(A >= B)
            return B;
        else
            return A;
    }
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print(min(Integer.parseInt(scan.next()),Integer.parseInt(scan.next()),Integer.parseInt(scan.next()),Integer.parseInt(scan.next())));
    }
}
