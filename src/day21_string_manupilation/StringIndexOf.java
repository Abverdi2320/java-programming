package day21_string_manupilation;

public class StringIndexOf {
    public static void main(String[] args) {
        String make = "Ferrari";
        System.out.println(make.indexOf("F"));//0
        System.out.println(make.indexOf("e"));//1
        System.out.println(make.indexOf("r"));//2
        System.out.println(make.indexOf("r"));//2
        System.out.println(make.indexOf("a"));//4
        System.out.println(make.indexOf("r"));//2
        System.out.println(make.indexOf("i"));//6



        String word = "github project";
        System.out.println(word.indexOf("g")); //0
        System.out.println(word.indexOf("u")); //4
        System.out.println(word.indexOf("hub")); //3
        System.out.println(word.indexOf("java"));//-1
        System.out.println(word.indexOf("t"));//2

        String klkl = "jump";
        System.out.println(klkl.startsWith("j"));
    }

}
