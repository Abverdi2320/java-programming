package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void Prepare() {
        System.out.println("Stretch the dough and put topping and cheese and bake it ");
    }

    @Override
    public void Serve() {
        System.out.println("Serve in plate or in a box ");
    }
}
