package day21_string_manupilation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "Github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub", "lab"));
        System.out.println("word = " + word);

        word = word.replace("hub", "lab");
        System.out.println("word = " + word);

        //gitlab
        //i - > o
        word.replace('i', 'o');
        System.out.println(word.replace('i', 'o').replace("a", "i"));


        String sentence = "java is fun";
        String withNoSpaces = sentence.replace("java", "selenium").replace("fun", " a lot of fun");
        System.out.println("withNoSpaces = " + withNoSpaces);

        sentence = sentence.replace("java", "selenium").replace("fun", "a lot of fun");


        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over","").replace(",","").replace("results for java book","");
        System.out.println("result = " + result);



    }
}
