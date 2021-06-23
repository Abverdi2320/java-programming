package day11_comparison_operators;

public class Practice {
    public static void main(String[] args) {
        int cars = 99;
        int parkingLot = ++cars;
        System.out.println("Cars = " + cars);
        System.out.println("Cars in parking lot = "+ parkingLot);

        int apples = 99;
        int basket = apples++;
        System.out.println("apples = " + apples);
        System.out.println("apples in basket = " + basket);
        System.out.println("apples in basket = " + basket);
        
        int bottles = 5;
        System.out.println("bottles = " + bottles);

        bottles = bottles + 7;
        System.out.println("bottles = " + bottles);
        
        int kiwi = 20;
        System.out.println("kiwi = " + kiwi);

        kiwi = kiwi +10;
        System.out.println("kiwi = " + kiwi);

        kiwi = kiwi/2;
        System.out.println("kiwi = " + kiwi);
        

        int a= 350;
        int b = 510;
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a !=b);
        
        boolean value = 3==5;
        System.out.println("value = " + value);
        value = 3>5;
        System.out.println("Value = " +value);
        value = 3<5;
        System.out.println("Value = " +value );
        value = 3>=5;
        System.out.println("value = " + value);
        value = 3<=5;
        System.out.println("value = " + value);
        value = 3!=5;
        System.out.println("value = " + value);

        String city = "Baku";
        System.out.println(city == "Baku");
        System.out.println(city == "Virginia");

        String model = "Nissan";
        System.out.println(model=="Nissan");
        System.out.println(model=="Mercedes");

        int c = 10;
        int d = 5;
        System.out.println("Five is  bigger than ten: ---> " + (d>c));
        System.out.println("Five is smaller than ten: ----> " + (d<c));
        System.out.println("Five is equal to ten: ----> " + (d==c ));
        System.out.println("Five is smaller or equal to ten: ---> " + (d<=c));
        System.out.println("Five is bigger or equal to ten: ---> " + (d>=c));
        System.out.println("Five is not bigger or is not equal: ---> " +(d!=c));


        int appples = 10;
        int totalApples= appples-- + appples++ /2* ++ appples- --appples;
        System.out.println(totalApples);





        
    }
}
