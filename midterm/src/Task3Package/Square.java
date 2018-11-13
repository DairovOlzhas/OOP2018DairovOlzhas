package Task3Package;

public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    public String toString(){
        return "Square: " + getSide() + " x " + getSide();
    }


    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Square)) return false;

        Square s = (Square) o;
        return (super.equals(s));
    }

}
