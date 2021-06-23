package ProblemSet1;

public class oddEven {
    public static void main(String[] args) {
        int nums[] = {45, 65, 22, 11, 7, 96, 9, 6};
        int odd = nums[0];
        int even = nums[0];

        for (int i = 0; i < nums.length; i++) {
           if (nums[i]%2==0){
               even =nums[i];
           }else {
               odd = nums[i];
           }
        }
        System.out.println("even = " + even/nums.length);
        System.out.println("odd = " + odd/nums.length);

    }
}
