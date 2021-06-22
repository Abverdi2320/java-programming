package Practice;

public class FizzBuzzPractice2 {
    public static void main(String[] args) {
        for(int i = 0; i<= 100; i++){
            if(i%2==0){
                System.out.println("Even Numbers " + i);
            }else if (i % 3==0 && i%5==0){
                System.out.println("Numbers that can divisible by 3 & 5 " + i);
            }
        }
    }
}
