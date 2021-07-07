package day57_abstraction_polymorphism.shapes;

import OfficeHours.Practice_06_15_2021.C;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());


        //System.out.println(shapes);  -- Prints Hashcodes of objects

        for (Shape each : shapes) {
            each.draw();
        }
        drawShape(new Circle());
        drawShape(new Square());
        drawShape(new Triangle());

        /**
         * static method:
         * accepts object of shape
         * then calls draw() method
         */

    }
    public static void drawShape(Circle shape){
        System.out.println("=====Drawing Shape======");
        shape.draw();
    }
    public static void drawShape(Square shape){
        System.out.println("=====Drawing Shape======");
        shape.draw();
    }
    public static void drawShape(Triangle shape){
        System.out.println("=====Drawing Shape======");
        shape.draw();
    }
}
