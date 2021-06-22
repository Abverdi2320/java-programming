package day30_Arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};
        for (int each : data) {
            System.out.println(each);
        }

        for (int n : data) {
            System.out.print("n = " + n + " ");
        }
        System.out.println("----------FOR LOOP--------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println(data[data.length - 1]);

        for (int n = data.length - 1; n >= 0; n--) {
            System.out.print(" " + data[n]);
        }
    }
}
