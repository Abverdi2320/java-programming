package day50_inheritance;

public class Cat extends Animal{
    public void jump(){
        System.out.println("Cat Jumps very high");
    }
    @Override
    public void speak(){
        System.out.println("Cat is saying Meow");

    }
}
