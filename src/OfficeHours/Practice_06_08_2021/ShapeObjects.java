package OfficeHours.Practice_06_08_2021;

public class ShapeObjects {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.calculateArea();

        Square square1  = new Square();
        square1.side=5;
        square1.calculateArea();
        System.out.println(square1);
        square1.calculatePerimeter();
        System.out.println(square1);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width=3;
        rectangle1.length=4;
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);

        Circle circle1 = new Circle();


    }
}
