package task4;

public class Point implements Replaced{

    private int x, y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int _x, int _y){
        x = _x;
        y = _y;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public double differenceBetweenPoints(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;

        return Math.sqrt(dx*dx+dy*dy);
    }
}
