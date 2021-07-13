package IQQUESTIONPreperation;



import java.util.ArrayList;
import java.util.Arrays;

public class _10_ReverseArrayListNumbers_with_method {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(setUp(nums));

    }
    public static String setUp(ArrayList<Integer> nums){
        String reverse = "";
        for (int i = nums.size()-1; i >=0; i--) {
            reverse+=nums.get(i);
        }
        return reverse;

    }
}
