package day34_void_methods;

public class StartCheapCar {
    public static void main(String[] args) {
        sitInCar();
        turnItOn();
        shiftGear();
        go();


    }


    public static void sitInCar() {
        System.out.println("1. Open the door and seat in Driver seat");

    }

    public static void turnItOn() {
        System.out.println("2. Turn the ignition on");
    }

    public static void shiftGear() {
        System.out.println("3. Put the gear on 'D' ");
    }

    public static void go() {
        System.out.println("4. Push gas pedal and go");

    }

}
