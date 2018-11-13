package task5;

public class King extends Piece {

    public boolean isLegalMove(Position a, Position b) {
        return checkPos(a,b)&& Math.abs(a.x - b.x) <=1 && Math.abs(a.y - b.y) <=1;
    }

    public String toString(){
        return "King";
    }
}
