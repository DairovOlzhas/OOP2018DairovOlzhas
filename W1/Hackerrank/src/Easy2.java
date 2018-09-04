import java.util.Scanner;

public class Easy2 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());

        if (n % 2 == 1 || (n % 2 == 0 && n >= 6 && n <= 20))
            System.out.print("Weird");
        if (n % 2 == 0 && ((n >= 2 && n <= 5) || n > 20))
            System.out.println("Not Weird");

    }
}