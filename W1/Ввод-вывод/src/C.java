import java.util.Scanner;

public class C {
    public static void main(String [] args){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        c = b/a;

        System.out.println(c);
    }
}
