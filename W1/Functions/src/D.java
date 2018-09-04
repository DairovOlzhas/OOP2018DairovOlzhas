import java.util.Scanner;

public class D {

    static int  golos(int a[]){
        int k = 0;
        for(int i = 0; i < 3; i++)
            if(a[i] == 1)
                k++;
        if(k > 1)
            return 1;
        return 0;

    }
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int a[] = new int[3];
        for(int i = 0; i < 3 ; i++)
            a[i] = Integer.parseInt(scan.next());
        System.out.print(golos(a));



    }
}
