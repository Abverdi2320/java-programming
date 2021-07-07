package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA,InterfaceB{
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }

    @Override
    public void methodB(){
        System.out.println("methodB overridden version is called");
    }

   // @Override -> static methods are hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }

//    public InterfaceA(){
//        System.out.println("Constructor is not welcome in Interface");
//
//    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called - " +num);
    }
}
