import java.util.Scanner;

public class Medium1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        while(scan.hasNext(s)) {
            String a[] = new String[4];
            a = s.split("\\.");

            boolean res = true;

            if (a.length == 4)
                for (int i = 0; i < 4; i++)
                    if (a[i].length() <= 3) {
                        boolean c = true;
                        for (int j = 0; j < a[i].length(); j++)
                            if (!Character.isDigit(a[i].charAt(j)))
                                c = false;
                        if (!(c && Integer.parseInt(a[i]) >= 0 && Integer.parseInt(a[i]) <= 255)) {
                            res = false;
                            break;
                        }
                    } else {
                        res = false;
                        break;
                    }
            else
                res = false;

            if (res)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

}
