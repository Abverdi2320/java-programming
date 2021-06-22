package Practice;

public class practice2 {
    public static void main(String[] args) {
        String genre = "Detective";
        short pageLength = 0;
        double profit = 0;
        byte sequels = 0;
        int countries = 0;

        switch (genre) {
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                System.out.println("Book = " + genre);
                break;

            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 5;
                countries = 45;
                System.out.println("Book = " + genre);
                break;

            case "Sciense Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                System.out.println("Book = " + countries);
                break;

            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                System.out.println("Book = " + countries);
        }
    }
}
