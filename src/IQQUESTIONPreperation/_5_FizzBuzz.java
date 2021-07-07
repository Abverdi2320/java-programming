package IQQUESTIONPreperation;

public class _5_FizzBuzz {
    public static void main(String[] args) {
        int num = 11;
        if (num % 3 == 0 && num %5==0){
            System.out.println("This is Fizz Buzz");
        }else if (num%3 ==0){
            System.out.println("This is Fizz");
        }else if(num%5==0){
            System.out.println("This is Buzz");
        }else{
            System.out.println("Invalid number ");
        }
    }


}
