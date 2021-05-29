package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomersObjects {
    public static void main(String[] args) {
        Customer any = new Customer();
        any.setName("Elvin");
        any.setId(122233);
        System.out.println(any);

        System.out.println();

        Customer cs2 = new Customer("Abbas",4342323);
        Customer cs3 = new Customer("Emin",6788732);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customer
        Customer[]todaysCustomers = {any,cs2,cs3,new Customer("Beshir",010)};


        //arrayList of Customer objects

        List<Customer> listOfCustomers = new ArrayList<>() ;
        listOfCustomers.add(any);
        listOfCustomers.add(cs2);
        listOfCustomers.add(cs3);
        listOfCustomers.add(new Customer("Beshir",449));
        listOfCustomers.add(new Customer("Suleyman",9763));
        listOfCustomers.add(new Customer("Elvin", 914));
        listOfCustomers.add(new Customer("Emin",251));

        System.out.println();

        //Print info of first Customer object in array and arrayList
        System.out.println(todaysCustomers[0].toString());
        System.out.println(listOfCustomers.get(0).toString());
        System.out.println(listOfCustomers);// print toString() info of all Customer objects

        System.out.println("-----FOR LOOP-------------");

        for (int i = 0; i < listOfCustomers.size(); i++) {
            System.out.println(listOfCustomers.get(i));
        }

        System.out.println("-----FOR EACH LOOP---------");
        for (Customer each : listOfCustomers) {
            System.out.println(each);
        }

        System.out.println("--------ONLY NAMES---------");

        listOfCustomers.forEach(each -> System.out.println(each.getName()));// lambda

        System.out.println("-------ONLY ID-------------");
        listOfCustomers.forEach(each2 -> System.out.println(each2.getId()));
    }
}
