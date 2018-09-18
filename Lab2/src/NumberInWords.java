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
    } // reversing number string for correct indicating of digit place

    public static String nums(char n, int c){
        String num = "";
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
    } // function which return digit in words in correct form by position

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String res = "";

        n = NumberInWords.reverse(n);
        n += " ";  // avoiding problem with checking previous digit

        for (int i = 0; i < n.length()-1; i++){

            String num = "";  // every digit in words
            if(i%3 == 0){  // single digit
                if(n.charAt(i+1) != '1'){
                    num = nums(n.charAt(i), 0);
                }
                if(i==3)
                    num += (num != "") ? " thousand" : "thousand";
            }
            else if(i%3 == 1){ // decimal digit
                if(n.charAt(i)== '1'){
                    if(n.charAt(i-1)=='0')
                        num = "ten";
                    else if(n.charAt(i-1)=='1')
                        num = "eleven";
                    else if(n.charAt(i-1)=='2')
                        num = "twelve";
                    else num = nums(n.charAt(i-1), 1) + "teen";
                }else if(n.charAt(i) != '0'){
                    num = nums(n.charAt(i), 1) + "ty";
                }
            }
            else if(i%3 == 2){  //hundreds

               if(n.charAt(i-1)!= '0' || n.charAt(i-2)!='0')
                   num = "[and]";
               if(n.charAt(i) != '0')
                   num = (num != "") ? nums(n.charAt(i), 0) + " hundred " + num : nums(n.charAt(i), 0) + " hundred";
            }

            //System.out.println(num);
            res = (num != "") ? num + " " + res : res;
        }

        System.out.println(res);
    }
}
