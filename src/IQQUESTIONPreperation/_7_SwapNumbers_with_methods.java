package IQQUESTIONPreperation;

public class _7_SwapNumbers_with_methods {
    public static void main(String[] args) {
        setUp(10,15);

    }
    public static void setUp(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
