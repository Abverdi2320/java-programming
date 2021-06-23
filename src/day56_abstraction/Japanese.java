package day56_abstraction;

public class Japanese implements Greeting{
    @Override
    public void hi() {
        System.out.println("Konichiva");
    }

    @Override
    public void bye() {
        System.out.println("Sayonora");

    }
}
