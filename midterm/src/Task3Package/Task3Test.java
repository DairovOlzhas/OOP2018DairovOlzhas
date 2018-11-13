package Task3Package;

public class Task3Test {
    public static void main(String [] args){
        Shape rectangleShape = new Rectangle(25, 40, "red", true);
        Shape circleShape = new Circle(55);
        Shape squareShape = new Square(25, "red", true);
        Rectangle rectangle = new Rectangle(25, 25, "red", true);
        Rectangle rectangle1 = new Rectangle(25, 25, "res", true);

        System.out.println("Area of rectangle:" + rectangleShape.getArea());
        System.out.println("Perimeter of rectangle:" + rectangleShape.getPerimeter());


        System.out.println(rectangleShape);
        System.out.println(squareShape);

        Shape shapes[] = {rectangleShape, circleShape, squareShape};

        for(int i = 0; i < 3; i++){
            System.out.println("Area and perimeter " + shapes[i].toString() + " " + shapes[i].getArea() + "; " + shapes[i].getPerimeter());
        }

        System.out.println("squareShape is equal to rectangle? " + rectangle.equals(squareShape));
        System.out.println("squareShape is equal to rectangle? " + rectangle.equals(rectangle1));

    }
}
