package day59_polymorphism_exceptions.Polymorphism_Execptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {

        //instance of operator
        Shape shape = new Square();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        System.out.println(shape.getClass().getSimpleName()); // just class name of object
        System.out.println(shape.getClass().getName()); // class name of object and package name

        if (shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a Square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("Object class name of el variable = " +el.getClass().getSimpleName());
        System.out.println(el.getClass().getDeclaredFields().getClass());
    }
}
