package az.atlacademy.lesson9;

public class ShapeApp {
    public static void main(String[] args) {
    Rectangle rectangle =new Rectangle();
    Circle circle = new Circle();
    Square square = new Square();

    call(rectangle);
    call(circle);
    call(square);
    }

    private static void call(Rectangle rectangle){
        rectangle.print();
    }
    private static void call(Circle circle){
        circle.print();
    }
    private static void call(Square square){
        square.print();
    }
}
