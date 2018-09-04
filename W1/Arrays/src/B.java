import java.util.Scanner;

public class B {


    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(scan.next());
        }

        for(int i = 0; i < n; i++)
            if(a[i] % 2 == 0)
                System.out.print(a[i] + " ");
    }
}
