import java.util.Scanner;

public class B {
    public static void main(String [] args){
        int a;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());

        if((a % 4 == 0 && a % 100 != 0)||(a % 4 == 0 && a % 400 == 0) )
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}
