package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {

        String name = "Abbas";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println("Name has " +name.length() + " character");
        System.out.println("wooden spoon".length()); //RESPECT THE SPACE
        String firstName = "Nadir";
        System.out.println(firstName + " = " + firstName.length() + " character");
        int count = firstName.length();
        System.out.println("count = " + count);


        String password = "abc123";
        if(password.length()>=6){
            System.out.println("valid amazon password");
        }else{
            System.out.println("invalid amazon password");
        }

        String countryCode = "USA";

        if(countryCode.equals(countryCode.toUpperCase()));
        System.out.println("countryCode = " + countryCode);
    }
}
