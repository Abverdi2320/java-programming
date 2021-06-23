package Reviews;

import java.util.ArrayList;

public class Car {
    String make;
    String model;
    String color;
    int year;

    public void drive(){
        System.out.println(make+ " " +model+ " " +color+" " + year + " is Such a nice car");
    }
    public void drive(String make, String model, String color, int year){
        System.out.println(make+ " " +model+ " " +color+" " + year + " is Such a nice car");
    }
    public void drive(Car carf){
        Car car2 = new Car();
        car2.make = "Ferrari";
        car2.model = "F355 GTB";
        car2.color = "Red";
        car2.year = 1997;

    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Mercedes";
        car1.model = "S class";
        car1.color = "White";
        car1.year = 2018;
        car1.drive();
        car1.drive("Maserati", "Quattroporte", "Black", 2020);
        car1.drive("Ferrari", "F355 GTB", "Red", 1997);
        System.out.println(car1.getClass().getName() + " = Data type");


        ArrayList<Car>list = new ArrayList<>();
        list.add(car1);

        System.out.println(list.get(0).make);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).color);
            System.out.println(list.get(i).year);
            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j).make);

            }
        }




    }

}
