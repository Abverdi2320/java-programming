package Reviews;

public class sumOfAllNums {
    public static void main(String[] args) {
        int nums = 0;
        for (int i = 1; i <= 100; i++) {
            nums++;
            if (i%2==0){
                System.out.println(nums);
            }
        }

    }
}
