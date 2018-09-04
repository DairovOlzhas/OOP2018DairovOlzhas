import java.util.Scanner;

public class C {

    static int  Xor(int x, int y){

     //   System.out.print(x + " " + y + "\n");
        if((x == 1|| y == 1)&&(x != 1 || y != 1) )
            return 1;
        else
            return 0;
    }
    public static <string> void main(String [] args){

        Scanner scan = new Scanner(System.in);



        boolean x,y;
        String xs = scan.next();
        String xy = scan.next();

      //  System.out.println(xs + " " + xy);
        if(xs == "0")
            x = Boolean.FALSE;
        else
            x = Boolean.TRUE;
        if(xy == "0")
            y = Boolean.FALSE;
        else
            y = Boolean.TRUE;

    //    System.out.print(x + " " + y + "\n");
        if(Xor(Integer.parseInt(xs), Integer.parseInt(xy)) == 1)
            System.out.print("1");
        else
            System.out.print("0");

    }
}
