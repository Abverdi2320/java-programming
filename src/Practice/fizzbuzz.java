package Practice;

public class fizzbuzz {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 1; i<=100; i++ ){
            if(i%3==0 && i%5==0){
                System.out.println(i+ " = FizzBuzz");
            }else if(i%3==0){
                System.out.println(i+ " = Even Fizz ");
            }else if(i%5==0){
                System.out.println(i+ " = Odd Buzz");
            }

        }
    }

}
