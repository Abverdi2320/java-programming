package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 328);
        ec1.drive(50);
        System.out.println(ec1.toString());
        //   System.out.println(ec1.make); ERROR: Make is private
        //   System.out.println(ElectricCar.make); ERROR .make needs to be public static
        System.out.println("ec1 Make = " + ec1.getMake());
        System.out.println("ec1 Model =  = " + ec1.getModel());
        System.out.println("ec1 Price = " + ec1.getPrice());
        System.out.println("ec1 Year = " + ec1.getYear());
        System.out.println("ec1 Range = " + ec1.getRange());

        if (ec1.getPrice() > 100000) {
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + "is out of my budget");
        } else {
            System.out.println("Purchasing " + ec1.toString());
        }

        System.out.println("Count = " + ElectricCar.getCount());


        ElectricCar ec2 = new ElectricCar("Tesla", "Cybertruck", 59900, 2022, 300);
        System.out.println(ec2.toString());
        System.out.println("Count = " + ec2.getCount());
        System.out.println("Count = " + ElectricCar.getCount());

        System.out.println();
        Roadster roadster = new Roadster("Roadster", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX x = new ModelX("Tesla","X",114.690,2022,360);
        System.out.println(x.toString());
        x.drive(100);
        System.out.println("Having lunch..");
        x.drive(150);
        System.out.println("Range remaining = " +x.getRange());
        System.out.println("Total electric cars count = " +x.getCount());

    }
}
