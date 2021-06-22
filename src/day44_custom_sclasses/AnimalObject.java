package day44_custom_sclasses;

public class AnimalObject {
    public static void main(String[] args) {
        Animal any = new Animal();
        System.out.println(any.type);
        any.eat("fish");
        any.speak();
        Animal cheetahObject = new Animal();
        cheetahObject.type = "Cheetah"; // change value to "cheetah"
        System.out.println(cheetahObject.type);
        cheetahObject.eat("Deer");
        cheetahObject.speak();



    }
}
