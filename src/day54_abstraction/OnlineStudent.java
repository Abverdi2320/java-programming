package day54_abstraction;

/**
 * -> OnlineStudent class will EXTEND Student abstract class
 */

public class OnlineStudent extends Student {
    /**
     * ->attendClass abstract method is implemented by the sub class
     * ->Sub class is overriding the abstract method of Parent class
     *
     */
    @Override
    public void attendClass() {
        System.out.println("Online student is attending the class using Zoom");
    }
}
