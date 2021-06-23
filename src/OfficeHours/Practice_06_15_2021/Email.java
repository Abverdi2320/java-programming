package OfficeHours.Practice_06_15_2021;

public class Email {
    final String address;
    int numberOfEmail;
    static String domain;

    static {
        domain="generic";
    }


    public Email(String address,int numberOfEmail){
        this.address=address;
        this.numberOfEmail=numberOfEmail;
    }


    public static void sendEmail(){
        System.out.println("Sending from PARENT");
    }

    @Override
    public String toString() {
        return "Email{" +
                "address='" + address + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", domain= " + domain +
                '}';
    }
}
