package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println("Full name is = " +fullName());
        System.out.println("Is married = " +isMarried());
        System.out.println("Age = " + getAge());
        System.out.println("The random year is = " + getRandomYear());
        System.out.println("Birth Year = " +getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if(isMarried()){
            System.out.println("Married");
        }else{
            System.out.println("Single");
        }

    }

    public static String fullName() {
        return "Abbas Verdiev";
    }

    public static boolean isMarried() {
        return false;
    }

    public static int getAge() {
        int age = 24;
        return 24;
    }

    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }




}
