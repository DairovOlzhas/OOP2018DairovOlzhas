import java.util.Scanner;

public class C {


    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());

        int a[] = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++){
            if(Integer.parseInt(scan.next()) > 0)
                k++;
        }

        System.out.print(k);/*
        for(int i = 0; i < n; i++)
            if(a[i] % 2 == 0)
                System.out.print(a[i] + " ");
*/    }
}
