package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("\n Even numbers 0 - 100");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "EVEN ");
            }


            for (int k = 0; k <= 100; k++) {
                if (k % 2 !=0){
                    System.out.println(k + " ODD");
                }
            }
            System.out.println("\n Odd numbers 0-100 ");
        }
    }
}