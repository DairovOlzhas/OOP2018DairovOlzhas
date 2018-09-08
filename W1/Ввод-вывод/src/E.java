import java.util.Scanner;
 
public class D {
    public static void main(String [] args){
        int v, t, s;
        Scanner scanner = new Scanner(System.in);
        v = Integer.parseInt(scanner.next());
        t = Integer.parseInt(scanner.next());
 
        s = (v*t)%109;
        if(s >= 0)
            System.out.println(s);
        else
            System.out.println(109+s);
    }
}