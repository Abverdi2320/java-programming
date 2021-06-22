package Practice;

public class practice5 {
    public static void main(String[] args) {
        String citizenship = "USA";
        int age = 24;
        boolean resident = true, hasDiploma = true;

        if (citizenship.equalsIgnoreCase("USA") || resident) {
            System.out.println("Is Citizen");
        } else {
            System.out.println("You must be U.S citizen or Resident");
        }
        if (age >= 18 && age <= 35) {
            System.out.println("Age between 18 and 35");
        } else {
            System.out.println("Age must be 18 to 35");
        }
        if (hasDiploma) {
            System.out.println("You are qualified for US Army");
        } else {
            System.out.println("Must have diploma");
        }
    }
}
