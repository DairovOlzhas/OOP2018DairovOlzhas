package task5;

import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String [] args){
        Piece[] pieces = {new Knight(), new Queen(), new Bishop(), new Rook(), new King(), new Pawn()};

        Scanner scanner = new Scanner(System.in);

        String pos1, pos2;
        pos1 = scanner.next();
        pos2 = scanner.next();

        Position a = new Position(pos1.charAt(1), pos1.charAt(0)-'0');
        Position b = new Position(pos2.charAt(1), pos2.charAt(0)-'0');

        for(int i = 0; i < 6; i++){
            System.out.println(pieces[i].toString() + " " + pieces[i].isLegalMove(a,b));
        }
    }


}
