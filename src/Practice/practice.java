package Practice;

public class practice {
    public static void main(String[] args) {
        String name = "Canyon";
        double price = 0;
        double rating = 0;
        String gated = "No";
        String allowPets = "Yes";

        switch (name) {
            case "Hills":
                price = 89.000;
                rating = 4.0;
                gated = "No";
                allowPets = "Yes";
                System.out.println(name + " is not bad neighborhood!");
                break;

            case "Oaks":
                price = 75.000;
                rating = 3.5;
                gated = "No";
                allowPets = "Yes";
                System.out.println(name + " Is bad neighborhood!");
                break;

            case "High":
                price = 150.000;
                rating = 4.5;
                gated = "Yes";
                allowPets = "No";
                System.out.println(name + " Is good neighborhood!");
                break;

            case "Canyon":
                price = 201.000;
                rating = 4.8;
                gated = "Yes";
                allowPets = "Yes";
                System.out.println(name + " Is the best neighborhood!");


        }


    }
}

