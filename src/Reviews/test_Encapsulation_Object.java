package Reviews;

public class test_Encapsulation_Object {
    public static void main(String[] args) {
        test_Encapsulation elvin = new test_Encapsulation();
        elvin.setAge(31);
        elvin.setJob("SDET");
        elvin.setName("Elvin");
        System.out.println(elvin);

        System.out.println();

        test_Encapsulation emin = new test_Encapsulation();
        emin.setName("Emin");
        emin.setJob("Avropa Otelinin Gabaginda 20 Manatdix");
        emin.setAge(35);
        System.out.println(emin);

        System.out.println();

        test_Encapsulation abbas = new test_Encapsulation();
        abbas.setAge(24);
        abbas.setJob("SDET");
        abbas.setName("Abbas");
        System.out.println(abbas);


    }
}
