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
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String res = "";

        n = NumberInWords.reverse(n);
        n += "     |";
     //   System.out.print(n);
        for (int i = 0; i < n.length()-6; i++){
            String num = "";
            if(n.charAt(i) == '1')
                num = "one";
            if(n.charAt(i) == '2')
                num = "two";
            if(n.charAt(i) == '3')
                num = "three";
            if(n.charAt(i) == '4')
                num = "four";
            if(n.charAt(i) == '5')
                num = "five";
            if(n.charAt(i) == '6')
                num = "six";
            if(n.charAt(i) == '7')
                num = "seven";
            if(n.charAt(i) == '8')
                num = "eight";
            if(n.charAt(i) == '9')
                num = "nine";

            if(i%3==1 || (n.charAt(i+1) == '1' && i%3==0)){
                if(n.charAt(i)=='3')
                    num = "thir";
                if(n.charAt(i)=='5')
                    num = "fif";
                if(n.charAt(i)=='8')
                    num = "eigh";
            }

            if(i%3==0 && n.charAt(i) != 0) {
                if(n.charAt(i+1) != '1') {
                    res = num + res;
                    continue;
                }
                else{
                    if(n.charAt(i) == '1')
                        num = "eleven";
                    else if (n.charAt(i) == '2')
                        num = "twelve";
                    else
                        num += "teen";
                }
            }

            if((i)%3==1){
                if(n.charAt(i)=='1')
                    if(n.charAt(i-1)=='0')
                        num = "ten";
                    else
                        num = "";
                else if(n.charAt(i)!='1')
                    num += "ty";
                if(num != "")
                    num = " " + num;
                if((i==1 && n.length() > 8) || (i==4 && n.length() > 10))
                num = "[and]"+num;
            }

            if((i)%3==2){
                num += " hundred";
            }

            if(i == 3)
                num += " thousand";
            //System.out.println(num);
            res = num + " " + res;
        }

        System.out.println(res);
    }
}
