import java.util.Scanner;

public class E {


    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());

        int a[] = new int[n];
        boolean x = false;
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(scan.next());
        }
        int k = 0;
        for(int i = 1; i < n; i++)
            if((a[i] < 0 && a[i-1] < 0)||(a[i] > 0 && a[i-1] > 0))
                x = true;
        if(x)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
