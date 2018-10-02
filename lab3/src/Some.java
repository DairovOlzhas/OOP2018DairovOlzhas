public class Some extends Piece {

    public boolean isLegalMove(Position a, Position b) {

        if(a.y == b.y || a.x == b.x)
            return true;
        return false;
    }
}