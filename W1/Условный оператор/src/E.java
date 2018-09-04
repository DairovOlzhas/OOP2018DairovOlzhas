import java.util.Scanner;

public class A {
    public static void main(String [] args){
        int a,b;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        if(a > b)
            System.out.println(1);
        else if(a < b)
            System.out.println(2);
        else
            System.out.println(0);


    }
}
