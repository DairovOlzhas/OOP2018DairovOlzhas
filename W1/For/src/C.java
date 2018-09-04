import java.util.Scanner;

public class C {
    public static void main(String [] args){
        int a,b;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        for(int i = a; i <= b; i++) {
            int d = (int) Math.floor(Math.sqrt(i));
            if (d * d == i)
                System.out.print(i + " ");
        }
    }
}
