package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("a"));
        System.out.println(company.contains("tal"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains("j"));

        //if company contains space, print "company name with multiple words"
        //else "single word company name

        if (company.contains(" ")) {
            System.out.println("company name with multiple words");
        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";

        if (etsyTitle.contains(" | ")) {
            System.out.println("title check pass");
        } else {
            System.out.println("title check did not pass");
        }

        String firstname = "ahmed";
        if (firstname.contains("a") && firstname.contains("e")) {
            System.out.println("contains both");
        } else {
            System.out.println("fail");
        }

        firstname = "Nadir";
        if (firstname.contains("a") || firstname.contains("i")) {
            System.out.println("a or i is present");
        } else {
            System.out.println("not a or i present");
        }

        String email = "Crazyfrog@gmail.com";
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("it is correct email");
        } else {
            System.out.println("its not correct email");
        }

        if(email.toLowerCase().contains("l")){
            System.out.println("contains l and lower case");
        }else{
            System.out.println("invalid");
        }

        String word = "java";
        System.out.println(word.replace("a","u"));


        String sentence = "java strings are fun";
        System.out.println(sentence);


    }
}
