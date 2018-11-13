package task1;

public class Cube implements Sphere{

    double side;

    @Override
    public double findVolume() {
        return side * side * side;
    }

    @Override
    public double findSurfaceArea() {
        return side * side * 8;
    }
}
