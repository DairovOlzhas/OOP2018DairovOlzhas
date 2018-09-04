import java.util.*;

public class I {
    public static void main(String [] args){
        int a, k = 1;

        Scanner scanner = new Scanner(System.in);

        a = Integer.parseInt(scanner.next());
        int b = a;
        int last_i, last_k;
        last_i = 2;
        last_k = 1;
        int c[] = new int[a];
        int size = 0;

        for(int i = 2; i <= b; i++){
            if(b % i == 0){
                c[size++] = i;
                b /= i;
                i--;
            }
        }

        for(int i = 1; i < size; i++){
         //   System.out.println(c[i] + " ");
            if(c[i] != c[i-1]) {
                k *= last_k + 1;
                last_k = 1;
            }else
                last_k++;
        }
        if(size!=0)
            k *= last_k + 1;



        System.out.println("\n" + k);
    }

}
