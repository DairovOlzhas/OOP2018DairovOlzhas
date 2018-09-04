import java.util.Scanner;

public class K {
    public static void main(String [] args){

        int a, sum = 0;

        Scanner scan = new Scanner(System.in);
        a = Integer.parseInt(scan.next());
        for(int i = 0; i < a; i++){
            if(Integer.parseInt(scan.next()) == 0)
                sum++;
        }

        System.out.println(sum);
    }

}
