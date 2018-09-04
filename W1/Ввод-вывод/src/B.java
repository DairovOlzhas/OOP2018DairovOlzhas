import java.util.Scanner;

public class B {
    public static void main(String [] args){
        int a;
        Scanner scanner = new Scanner(System.in);
        a = Integer.parseInt(scanner.next());


        System.out.printf("The next number for the number %d is %d. \n", a, a+1);
        System.out.printf("The previous number for the number %d is %d. \n", a, a-1);
    }
}
