import java.util.Scanner;

public class A {
    public static void main(String [] args){
        int a,b;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);


    }
}
