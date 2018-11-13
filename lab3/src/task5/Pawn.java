package task5;

public class Pawn extends Piece {
    @Override
    public boolean isLegalMove(Position a, Position b) {
        return (Math.abs(a.y - b.y) == 1 && a.x == b.x) && checkPos(a,b) ;
    }


    public String toString(){
        return "Pawn";
    }
}
