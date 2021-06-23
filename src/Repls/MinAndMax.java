package Repls;

public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,-3,10,4,3};
        int min = arr[0];
        int max = arr[0];


        for(int i =0;  i<arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }

            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min: " +min);
        System.out.println("Max: " +max);

    }
}
