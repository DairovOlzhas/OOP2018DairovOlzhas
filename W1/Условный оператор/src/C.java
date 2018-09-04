import java.util.Scanner;

public class C {
    public static void main(String [] args){
        int a, b;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        if((a != 1 && b != 1) || (a == 1 && b == 1))
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}
