public class King extends Piece {

    public boolean isLegalMove(Position a, Position b) {

        if(Math.abs(a.x - b.x) <=1 && Math.abs(a.y - b.y) <=1)
            return true;
        return false;
    }
}
