package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        Worker worker = new Superman();
        worker.work("QA Manager");
        worker.getPaid();


    }
}
