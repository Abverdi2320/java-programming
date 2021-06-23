package OfficeHours.Practice_06_15_2021;

public class EmailObjects {
    public static void main(String[] args) {
        Email email = new Email("CrazyFrog@gmail.com", 303);
        //  email.address ="email"; -> Address is final, so cannot be change
        System.out.println(email);
        System.out.println(email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);

        System.out.println();

        Gmail gmail = new Gmail("Abverdi2320@gmail.com", 2450);
        System.out.println(gmail);
        System.out.println(gmail.domain);
        System.out.println(email.domain);
        System.out.println(Yahoo.domain);

        System.out.println();

        Yahoo yahoo = new Yahoo("AbulikAbulik7@gmail.com", 7774);
        System.out.println(yahoo);
        System.out.println(Email.domain);
        System.out.println(gmail.domain);
        System.out.println(yahoo.domain);

        System.out.println();


        //Object below wont change because Static runs only once at the beginning
        Email email2 = new Email("random@gmail.com", 35);
        System.out.println(Email.domain);
        System.out.println(gmail.domain);
        System.out.println(yahoo.domain);


        email.sendEmail();
        gmail.sendEmail();
        yahoo.sendEmail();



    }
}
