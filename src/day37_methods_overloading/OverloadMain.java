package day37_methods_overloading;


import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("WAAASSSSUUUUPPPP");
        main(10);
        System.out.println(Arrays.toString(args));


    }
    public static void main (int num1){
        System.out.println("Hello " + num1);

    }
}
