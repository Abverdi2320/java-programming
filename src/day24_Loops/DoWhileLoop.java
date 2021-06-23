package day24_Loops;


public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        do{
            System.out.println("counter = " + counter);
            counter+=100;
        }while(counter<=1000);

        System.out.println("Finish!");



    }
}