package task2;

public class Cylinder extends Shapes3D {

    int height, width, lenght;

    public double volume() {
        return height*lenght*width;
    }

    public double density(int density) {
        return density * volume();
    }

    public double surfaceArea() {
        return height * lenght * 2 + height * width * 2 + lenght * width * 2;
    }
}
