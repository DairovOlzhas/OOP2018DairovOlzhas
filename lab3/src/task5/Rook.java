package task5;

public class Rook extends Piece {
    public boolean isLegalMove(Position a, Position b) {
        return (a.y == b.y || a.x == b.x) && checkPos(a,b) ;
    }

    public String toString(){
        return "Rook";
    }
}
