package day54_abstraction;

public class Salad extends MenuItem{
    @Override
    public void Prepare() {
        System.out.println("Chop veggies, and dressing");
    }

    @Override
    public void Serve() {
        System.out.println("Put into bowl, and serve with forks");
    }
}
