package OfficeHours.Practice_03_29_2021;

public class Sandwich {
    public static void main(String[] args) {
        String str = "breadjambread";

        if(str.contains("bread")){

            int firsBread = str.indexOf("bread");
            if(str.substring(firsBread+5).contains("bread")){

                int secondBread = str.lastIndexOf("bread");
                System.out.println(str.substring(firsBread+5,secondBread));

            }


        }else {
            System.out.println("nothing");
        }
    }
}
