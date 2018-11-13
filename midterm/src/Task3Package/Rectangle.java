package Task3Package;

public class Rectangle extends Shape {

    double width;
    double length;

    public Rectangle(){
        width = 0;
        length = 0;
    }

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return ( length + width ) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle " + width + " x " + length;
    }


    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Rectangle)) return false;

        Rectangle r = (Rectangle) o;
        return (r.length == this.length && r.width == this.width && r.getColor() == this.getColor() && r.isFilled() == this.isFilled());
    }
}
