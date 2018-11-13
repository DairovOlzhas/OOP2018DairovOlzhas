package task5;

public class Queen extends Piece {


    @Override
    public boolean isLegalMove(Position a, Position b) {
        Piece p1 = new Bishop();
        Piece p2 = new Rook();
        return (p1.isLegalMove(a,b) || p2.isLegalMove(a,b))  && checkPos(a,b) ;
    }


    public String toString(){
        return "Queen";
    }
}
