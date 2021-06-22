package Repls;

public class practice {
    public static void main(String[] args) {

        for(int nums = 1; nums< 100; nums++){
            if(nums % 3 == 0 && nums % 5 == 0 ){
                System.out.println("Finra " +nums);
            }
            if( nums % 3==0){
                System.out.println("fin " +nums);
            }
            if(nums % 5==0){
                System.out.println("ra " +nums );
            }


        }


    }
}
