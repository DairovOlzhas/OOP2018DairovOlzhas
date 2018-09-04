import java.util.Scanner;

public class A {
    public static void main(String [] args){
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        c = Math.sqrt(a*a + b*b);

        System.out.println(c);
    }
}
