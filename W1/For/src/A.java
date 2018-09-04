import java.util.Scanner;

public class A {
    public static void main(String [] args){
        int a,b;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        for(int i = a; i <= b; i++)
            if(i % 2 == 0)
                System.out.println(i + " ");


    }
}
