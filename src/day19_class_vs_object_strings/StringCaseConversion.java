package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "GlaDiAtoR";
        String sentence = "Java IS FUN";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println(sentence.toLowerCase());
        System.out.println("JAVA".toLowerCase()); // Can also do that way


        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        //change word to all lowercase letters. and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);


        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " +company.toUpperCase());
        System.out.println("java ".toUpperCase());

        //change company "Amazon" to "AMAZON
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);



    }
}
