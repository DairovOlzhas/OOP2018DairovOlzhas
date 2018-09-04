import java.util.Scanner;

public class B {
    public static void main(String [] args){
        int a,b,c,d;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());
        c = Integer.parseInt(scanner.next());
        d = Integer.parseInt(scanner.next());

        for(int i = a; i <= b; i++)
            if(i % d == c)
                System.out.println(i + " ");


    }
}
