package Practice;

import java.util.*;

public class SplitPractice {
    public static void main(String[] args) {
        String cars = "tesla ferrari lamborghini lincoln bugatti";
        String[] brands = cars.split(" ");
        System.out.println(Arrays.toString(brands));
        System.out.println(brands.length);
        for (String each : brands) {
            System.out.println("Brands are = " + each.toUpperCase());

        }


        String words = ("About 1,070,000,000 results (0.82 seconds) ");
        String[] result = words.split(" ");
        System.out.println(Arrays.toString(result));
        System.out.println("Results for this search are = " +result[1]);
        System.out.println("Seconds for this search are = " +result[3].replace("(",""));



        String names = ("Murodil Nadir Mukhtar Guljannat Vesa");
        String [] str = names.split(" ");
        System.out.println(Arrays.toString(str));
        for(int i = str.length-1; i>=0; i--){
            System.out.print(str[i]+" ");
        }

        String oneByOne = ("Java is fun ");
        String arr[]  = oneByOne.split(" ");
        System.out.println("First word = " + arr[0]);
        System.out.println("Second word = " + arr[1]);
        System.out.println("Third word = " + arr[2]);
        for(String each:arr){
            System.out.println("each = " + each);
        }



        String app = "Facebook";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("\n---- Starting deployment of Facebook app to AWS zones....");
        String [] sss = zones.split(",");
        System.out.println(app+ " = " +Arrays.toString(sss));

        for(String each : sss){
            System.out.println("Deploying " + "["+app+"]" + each + ".....");
            System.out.println("Deployment completed at " + each);

        }







    }
}

