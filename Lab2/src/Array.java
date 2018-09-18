import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Array {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);


        int[] a = new int[100000];
        int[] b = new int[100000];
        int k = 0;

        while(sc.hasNextInt()){
            a[k++] = sc.nextInt();
        }

        for(int i = 0; i < k; i++){
            b[i*2] = a[i];
            b[i*2+1] = a[i];
        }

        for(int i = 0; i < k*2; i++){
            System.out.print(b[i] + " ");
        }
    }
}
