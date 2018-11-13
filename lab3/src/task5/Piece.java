package task5;

public abstract class Piece {

    public abstract boolean isLegalMove(Position a, Position b);
    public boolean checkPos(Position a, Position b){
        return (a.x >= 'a' && a.x <= 'h' && a.y >= 1 && a.y <= 8)&&(b.x >= 'a' && b.x <= 'h' && b.y >= 1 && b.y <= 8);
    };

    public abstract String toString();
}







