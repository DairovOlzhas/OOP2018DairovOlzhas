package Task3Package;

public class Circle extends Shape {

    double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle with radius:" + radius;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Circle)) return false;

        Circle c = (Circle) o;
        return (c.radius == this.radius && c.getColor() == this.getColor() && c.isFilled() == this.isFilled());
    }
}
