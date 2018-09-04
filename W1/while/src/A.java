import java.util.Scanner;

public class A {

    public static boolean Check(int a){
        boolean res = false;

        int b = (int)Math.sqrt(a);
        if(b*b == a)
            res = true;
        return res;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.next());

        for(int i = 1; i <= a; i++)
            if(Check(i))
                System.out.println(i);
    }
}
