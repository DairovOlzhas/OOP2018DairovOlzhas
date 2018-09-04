import java.util.Scanner;

public class D {
    public static void main(String [] args){
        int a;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());

        if(a > 0)
            System.out.println("1");
        else if(a < 0)
            System.out.println("-1");
        else
            System.out.println("0");


    }
}
