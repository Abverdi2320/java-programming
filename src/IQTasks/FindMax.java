package IQTasks;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int maxValue(int[]n){
        int max = Integer.MIN_VALUE;
        for (int each:n){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
}
