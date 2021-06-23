package day06_arthmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String Model = "Jeep Wrangler";
        String DriverName = "Batman";
        String licenseNumber = "btm123";
        short speed = 80;
        boolean isAutomatic = false;
        char licenseClass = 'D';

        System.out.println("Model is:\t\t\t " + Model);
        System.out.println("Driver Name is:\t\t " + DriverName);
        System.out.println("LicenseNumber is:\t " + licenseNumber);
        System.out.println("Speed is:\t\t\t " + speed);
        System.out.println("IsAutomatic is:\t\t " + isAutomatic);
        System.out.println("LicenseClass is:\t " + licenseClass);
        System.out.println();


        System.out.println("Car model: " + Model);
        System.out.println(Model + " is Model");
        System.out.println("Driver name " + DriverName);
        System.out.println(DriverName);
        System.out.println(DriverName + " is driving a car");

        System.out.println(DriverName +" is driving "+ Model);
        System.out.println();
        System.out.println("Current speed: " + speed+ " Mph");
        System.out.println();
        System.out.println("Is car automatic --> " +isAutomatic);
        System.out.println();
        System.out.println("is car automatic --> " +isAutomatic);
        System.out.println(licenseClass +"-"+ isAutomatic);





    }
}
