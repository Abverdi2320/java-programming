package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        //num[3] = 100 cannot be
        System.out.println("Value at index 0 = " + nums[0]);
        System.out.println("Value at index 1 = " + nums[1]);
        System.out.println("Value at index 2 = " + nums[2]);


        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);//5
        i++;
        System.out.println(nums[i]);//10

        //how to find out the size of array.
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable.


        int len = nums.length;
        System.out.println("len = " + len);

        //can we change values in array ?? - YES WE CAN
        nums[0] = 100;
        nums[1] = 300;
        //read th value of index 1 and assign same to index 2
        nums[2] = nums[1];
        System.out.println("nums [0] = " + nums[0]);
        System.out.println("nums [1] = " + nums[1]);
        System.out.println("nums [2] = " + nums[2]);

        int[] numss = {234,12,343,545,234,222,99};
        //in above example we declae array with size 7 and assigned values in same statement.
        System.out.println(numss.length);
        System.out.println(numss[0]);

        //declare and assign value in same statement.
        double[] price = new double[]{10.3,44.0,23.99};


    }
}
