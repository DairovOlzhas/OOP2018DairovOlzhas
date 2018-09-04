import java.util.Scanner;

public class D {


    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(scan.next());
        }
        int k = 0;
        for(int i = 1; i < n; i++)
            if(a[i] > a[i-1])
                k++;
        System.out.print(k);
    }
}
