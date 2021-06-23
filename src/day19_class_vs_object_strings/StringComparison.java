package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Baku";
        //EQUALS() method - CASE SENSITIVE COMPARISON
        System.out.println(city.equals("Baku"));
        System.out.println(city.equals("baku"));
        System.out.println(city.equals("Baku "));


        //EQUALSINGORECASE() method- CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("Baku"));
        System.out.println(city.equalsIgnoreCase("BaKu"));
        System.out.println(city.equalsIgnoreCase("BAKU"));
        System.out.println(city.equalsIgnoreCase("Baaku"));
        System.out.println(city.equalsIgnoreCase("Bak u "));
        System.out.println(city.equalsIgnoreCase(""));

        if(city.equals("BAKU")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("BAKU")){
            System.out.println("equalsIgnoreCase() true");
        }else{
            System.out.println("equalsIgnoreCase() false");
        }
    }
}

