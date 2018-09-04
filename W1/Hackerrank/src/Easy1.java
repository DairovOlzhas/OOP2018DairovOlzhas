import java.util.Scanner;

public class Easy1 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int a[] = new int[3];

        for(int i = 0; i < 3; i++)
            a[i] = Integer.parseInt(scan.next());

        for(int i = 0; i < 3; i++)
            System.out.print(a[i] + "\n");
    }
}
