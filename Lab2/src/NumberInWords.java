import java.util.Scanner;

import static java.sql.Types.NULL;

public class NumberInWords {
    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    public static String nums(char n, int c){
        String num = "";
        if(n == '0')
            if(c == 1)
                num = "ten";
        if(n == '1')
            if(c == 0)
                num = "one";
        if(n == '2')
            if(c == 0)
                num = "two";
            else if(c == 1)
                num = "twen";
        if(n == '3')
            if(c == 0)
                num = "three";
            else if(c == 1)
                num = "thir";
        if(n == '4')
            num = "four";
        if(n == '5')
            if(c == 0)
                num = "five";
            else if(c == 1)
                num = "fif";
        if(n == '6')
            num = "six";
        if(n == '7')
            num = "seven";
        if(n == '8')
            if(c == 0)
                num = "eight";
            else if(c == 1)
                num = "eigh";
        if(n == '9')
            num = "nine";
        return num;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String res = "";

        n = NumberInWords.reverse(n);
     //   System.out.print(n);
        n += " ";

        for (int i = 0; i < n.length()-1; i++){          // 9 8 7 6 5 4
                                                       // 5 4 3 2 1 0
            String num = "";
            if(i%3 == 0){
                if(n.charAt(i+1) != '1'){
                    num = nums(n.charAt(i), 0);
                }
                if(i==3)
                    num += (num != "") ? "thousand" : " thousand";
            }
            if(i%3 == 1){
                if(n.charAt(i)== '1'){
                    if(n.charAt(i-1)=='1')
                        num = "eleven";
                    else if(n.charAt(i-1)=='2')
                        num = "twelve";
                    else num = nums(n.charAt(i-1), 1) + "teen";
                }else if(n.charAt(i) != '0'){
                    num = nums(n.charAt(i), 1) + "ty";
                }
            }
            if(i%3 == 2){
                if(res != "")
                    num = "[and]";
                num = (num != "") ? nums(n.charAt(i), 0) + " hundred " + num : nums(n.charAt(i), 0) + " hundred";
            }

            //System.out.println(num);
            res = num + " " + res;
        }

        System.out.println(res);
    }
}
