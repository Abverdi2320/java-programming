package Practice;

public class FizzBuzzPracticeTask {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println("ODD Numbers only " + i);
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            }
            if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }
        }
    }

}
