package task2;

public class Sphere extends Shapes3D {
    private int radious;

    public double volume() {
        return radious*radious;
    }

    public double density(int den) {
        return 2 * this.volume()*den;
    }

    public double surfaceArea() {
        return radious*radious*2*Math.PI;
    }


}
