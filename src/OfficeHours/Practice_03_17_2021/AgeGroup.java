package OfficeHours.Practice_03_17_2021;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 10;

        if(age > 0 && age <120){
            if(age <= 2){
                System.out.println("Infant");
            }else if (age >= 3 && age <= 5 ){
                System.out.println("Toddler");
            }else if (age >= 6 && age <= 9){
                System.out.println("Kid");
            }else if (age >=10 && age <=12){
                System.out.println("Pre-Teen");
            }else if (age >=13 && age <= 17){
                System.out.println("Teenager");
            }else if (age >= 18 && age <= 20){
                System.out.println("Young Adult");
            }else if(age >= 21 && age <= 39){
                System.out.println("Adult");
            }else if(age >= 40 && age<= 49){
                System.out.println("Middle aged adult");
            }else if(age >= 50 && age<= 54){
                System.out.println("");
            }



        }else{
            System.out.println("Invalid age");
        }
    }
}
