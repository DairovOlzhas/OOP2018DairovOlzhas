package task5;

public class Knight extends Piece {
    @Override
    public boolean isLegalMove(Position a, Position b) {
        return ((Math.abs(a.y - b.y) == 1 && Math.abs(a.x - b.x) == 2)|| (Math.abs(a.y - b.y) == 2 && Math.abs(a.x - b.x) == 1)) && checkPos(a,b) ;
    }

    public String toString(){
        return "Knight";
    }

}
