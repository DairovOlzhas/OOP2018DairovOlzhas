import java.util.Scanner;

public class C {

    public static boolean check(int a){
        boolean res = false;
        if(a == 1)
            return true;
        if(a % 2 == 0)
            return check(a/2);
        else return false;
    }


    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());


        if(check(a))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
