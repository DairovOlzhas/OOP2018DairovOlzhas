package Task1Package;

import java.util.Scanner;

public class Sequence {
    private String word;

    public Sequence(String word){
        this.word = word;
    }

    public boolean isPalindrome(){
        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i))
                return false;
        }
        return true;
    }

    public boolean isSubString(Sequence s){
        for(int i = 0; i < this.word.length()-s.word.length(); i++){
            if(word.substring(i, i+s.word.length()).equals(s.word))
                return true;
        }
        return false;
    }

}
