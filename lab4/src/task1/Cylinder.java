package task1;

public class Cylinder implements Sphere {

    double radious, height;


    public Cylinder(){
        radious = 0;
        height = 0;
    }

    public Cylinder(double r, double h){
        radious = r;
        height = h;
    }

    @Override
    public double findVolume() {
        return height * Math.PI * radious * radious;
    }

    @Override
    public double findSurfaceArea() {
        return height * 2 * Math.PI * radious + 2 * Math.PI * radious * radious;
    }



}
