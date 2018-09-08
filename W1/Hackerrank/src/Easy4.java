import java.util.Scanner;

public class Easy4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            for(int j = s1.length(); j < 15; j++)
                s1 += " ";

            System.out.printf("%s%03d\n", s1, x);//Complete this line
        }
        System.out.println("================================");

    }
}



