package Task1Package;

import java.util.Scanner;

public class Task1Test {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Sequence s1 = new Sequence(sc.next());
        Sequence s2 = new Sequence(sc.next());

        System.out.println("s1 is palindrom: " + s1.isPalindrome());
        System.out.println("s1 is Substring of s2: " + s2.isSubString(s1));

    }
}
