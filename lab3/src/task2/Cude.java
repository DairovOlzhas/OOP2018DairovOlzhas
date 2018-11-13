package task2;

public class Cude extends Shapes3D {
    private double height, radious;

    public double volume() {
        return radious*radious*2*Math.PI*height;
    }

    public double density(int den) {
        return den * volume();
    }

    public double surfaceArea() {
        return height*radious*2*Math.PI;
    }
}
