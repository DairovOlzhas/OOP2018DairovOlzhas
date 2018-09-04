import java.util.Scanner;

public class H {
    public static void main(String [] args){
        int a;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());

        for(int i = 1; i <= a; i++) {
            if (a % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
