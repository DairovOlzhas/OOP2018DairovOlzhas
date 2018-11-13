package task5;

public class Bishop extends Piece {
    @Override
    public boolean isLegalMove(Position a, Position b) {
        return (Math.abs(a.x-b.x) == Math.abs(a.y - b.y));
    }


    public String toString(){
        return "Bishop";
    }
}
