package Reviews;

public class test_Instance_Object {
    public static void main(String[] args) {
        test_Instance elvin = new test_Instance();
        elvin.age = 30;
        elvin.gender = 'M';
        elvin.job = "SDET";
        elvin.name = "Elvin";
        elvin.running();
        System.out.println(elvin);
        System.out.println("Elvin burning " + elvin.calories(30,3) + " Calories after running");

        System.out.println();

        test_Instance emin = new test_Instance();
        emin.age = 35;
        emin.job = "SDET";
        emin.name = "Emin";
        emin.gender = 'M';
        emin.swimming();
        System.out.println(emin);
        System.out.println("Emin Burning " +emin.calories(30,5) + " Calories after Swimming");
        System.out.println();


        test_Instance abbas = new test_Instance();
        abbas.age = 24;
        abbas.gender = 'M';
        abbas.job = "SDET";
        abbas.name = "Abbas";
        abbas.biking();
        System.out.println(abbas);
        System.out.println("Abbas Burning " +abbas.calories(40,3) + " Calories after Biking");




    }
}
