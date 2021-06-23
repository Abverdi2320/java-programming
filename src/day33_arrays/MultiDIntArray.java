package day33_arrays;

public class MultiDIntArray {
    public static void main(String[] args) {
        int[][] nums2D = {
                {12, 55, 4, 7},    //0 sira
                {123, 555, 9},       //1 sira
                {56, 87, 455, 34},   //2 sira
                {234, 12, 54, 23, 23}//3 sira
        };
        System.out.println("nums2d[3][4] = " + nums2D[3][4]);

        for (int i = 0; i < nums2D.length; i++) {
            for (int j = 0; j < nums2D[i].length; j++) {
                System.out.print(nums2D[i][j] + "\t");
            }
            System.out.println();
        }


        int number[][] = {{12, 45, 78}, {78, 82, 89}, {63, 64, 99}, {78, 96, 55}};

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] % 2 == 0) {
                    System.out.println(number[i][j]);
                }
            }
        }

        int num1[] = {5, 1, 5, 8, 778, 56, 3};
        int num2[] = {1, 5, 3, 76, 12, 45};


        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    System.out.print(num1[i]);
                }
            }
        }

        int num[] = {5, 1, 5, 8, 778, 56, 3};
        int num3[] = {1, 5, 3, 76, 12, 45};
        boolean check = true;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num[i] == num3[j]) {
                    check = false;
                }
            }
            System.out.println(check);
        }


    }
}
