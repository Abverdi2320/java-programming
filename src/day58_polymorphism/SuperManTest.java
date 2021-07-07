package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father father = new Superman();
        father.feedKid();
        father.playWithKid();
        father.raiseKid();


        Worker worker = new Superman();
        worker.work("SDET");
        System.out.println("got paid $" +worker.getPaid());

        System.out.println();


        Superman superman = new Superman();
        superman.getPaid();
        superman.work("Scrum Master");
        superman.feedKid();
        superman.raiseKid();
        superman.playWithKid();


    }
}
