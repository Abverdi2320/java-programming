package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        //declare arrayList
        ArrayList<String> cities = new ArrayList<>();

        //add cities to arrayList -> add methods

        cities.add("Washington DC");// index 0
        cities.add("New York");// index 1
        cities.add("Vienna");// index 2
        cities.add("Adana");// index 3
        cities.add("LA");// index 4c
        //add Ashgabat to first index
        cities.add(0,"Ashgabat");
        //print all values in same line
        System.out.println(cities);
        System.out.println();
        //print first and last city
        System.out.println("First city = " +cities.get(0));
        System.out.println("Last city = " +cities.get(5)); //not dynamic
        //find last index using size()-1
        System.out.println("Last sity = " +cities.get(cities.size()-1));

        ///print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("There are " + size +" cities in the list");

        //for loop and print all values in the same line
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();

        for(String city:cities){
            System.out.print(city+" ");

        }
        System.out.println();
        //delete item from arrayList
        //1) remove using index. means delete value at index 3
        cities.remove(3);
        //2)remove using object/value
        cities.remove("New York");

        System.out.println("after remove = " +cities);
        System.out.println();

        //delete/remove all values from list
        cities.clear();
        //make sure it is clear
        //1) print it out
        System.out.println("everything after clear = " + cities);
        //2) using isEmpty
        if(cities.isEmpty()){
            System.out.println("list is empty");
        }

        //3) check size()==0
        if(cities.size()==0){
            System.out.println("list is empty");
        }




    }
}
