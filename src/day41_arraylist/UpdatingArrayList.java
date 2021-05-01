package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //car list
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0,"Jeep");
        myCars.add(1,"Lada");
        myCars.add(2,"Yugo");

        System.out.println(myCars); //prints all cars
        String allCarsIn1St = myCars.toString(); //saves all cars in 1 string variable

        System.out.println("allCarsIn1St = " + allCarsIn1St);

        //change index 0 to Lamborghini

        myCars.set(0,"Lamborghini");

        System.out.println("after set = " + myCars.toString());
        //change index 4 to honda

        myCars.set(4,"Honda");
        System.out.println("after set = " + myCars.toString());

        //find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("Ford"));
        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change moskvich to jiquli
        myCars.set(moskvichIndex,"jiquli");
        System.out.println("after set to jiquli = " + myCars);

        //replace ford with trabant using single statement:
        //index of("ford), "trabant

        myCars.set(myCars.indexOf("Ford"), "trabant");
        System.out.println("after set to trabant" + myCars);

        if(myCars.contains("Lada")){
            myCars.set(myCars.indexOf("Lada"), "Bugatti");
            System.out.println(myCars);
        }else{
            System.out.println("lada is not found");
        }

        System.out.println();

        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")) {
                myCars.set(i, "prius");
            }else if (myCars.get(i).equals("Toyota")){
                myCars.set(i,"lexus");
            }else if (myCars.get(i).equals("trabant")){
                myCars.set(i,"audi");
            }
        }
        System.out.println("after loop " +myCars);





    }
}
