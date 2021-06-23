package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "Snowy";
        if(weather.equals("Sunny")){
            System.out.println(weather + " Go to park and play");
        }else if (weather.equals("Rainy")){
            System.out.println(weather + " Go out with umbrella");
        }else if (weather.equals("Snowy")){
            System.out.println(weather + " Go to Skiing");
        }else if (weather.equals("Windy")){
            System.out.println(weather + " Sit home and code Java");
        }
        System.out.println("After skiing Just sit home drink hot chocholate and code Java");
    }
}
