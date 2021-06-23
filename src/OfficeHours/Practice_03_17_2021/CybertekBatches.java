package OfficeHours.Practice_03_17_2021;

public class CybertekBatches {
    public static void main(String[] args) {

        String batchType = "US";

        if (batchType.equals("US") || batchType.equals("us")) {

            boolean isMorning = false;
            if (isMorning) {
                System.out.println("Class times are 10-5 EST. m,t,w,th,f,");
            } else {
                System.out.println("Class times are 7-10 EST. m,t,w,th,f,");
            }

        } else if (batchType.equals("EU") || batchType.equals("eu")) {
            System.out.println("Class times are 10-5 EST. m,t,w,th,f,");
        } else {
            System.out.println("Invalid Batch type");
        }
    }
}
