package IQTasks;

public class VehicleObject {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();

        sedan.color = "Black";
        sedan.name = "Cewka";
        sedan.price = 14.500;
        sedan.year = 2001;
        sedan.speed();
        sedan.fourDoors();

        System.out.println();

        suv suv = new suv();
        suv.year = 2020;
        suv.price = 89.000;
        suv.name = "Lincoln Navigator";
        suv.color = "Black";
        suv.speed();
        suv.offRoad();

        System.out.println();

        Hatchback hatchback = new Hatchback();
        hatchback.name = "Hyundai Veloster";
        hatchback.color = "Yellow";
        hatchback.price = 23.500;
        hatchback.year = 2013;
        hatchback.speed();
        hatchback.ecoCar();







    }
}
