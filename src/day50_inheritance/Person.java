package day50_inheritance;


/**
 * Super Class
 * Parent Class
 * Base Class
 * We can choose any of them
 */
public class Person {
    String name;
    int age;

    public void walk(){
        System.out.println(name+ " walking");
    }
    public void talk(){
        System.out.println(name+ " talking");
    }

    public void work(String job){
        System.out.println(name + " working as " +job);
    }
}
