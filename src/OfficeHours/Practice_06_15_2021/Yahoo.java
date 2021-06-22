package OfficeHours.Practice_06_15_2021;

public class Yahoo extends Email {
    static String domain;

    static {
        domain = "Yahoo";
    }

    public static void sendEmail(){
        System.out.println("Sending from PARENT");
    }

    public Yahoo(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
