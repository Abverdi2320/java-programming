package day30_Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day24_Loops.YouTubeCatVideo;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {


        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "Azerbaijan",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        System.out.println("----Prices more than 100----");
        for (double eachPrice : prices) {
            if (eachPrice > 100.0)
                System.out.println(eachPrice);
        }

        System.out.println("\n---- prices between 10 and 70 inclusive");
        for (double each : prices) {
            if (each >= 10.0 && each <= 70) {
                System.out.println(each);
            }
        }

        System.out.println("\n ------- count of the prices more than 50 ------");
        int count = 0;
        for(double aa : prices){
            if(aa>50){
                count++;

            }
        }
        System.out.println("count " + count);


        System.out.println("\n ----- Countries with name length more than 7 ------ ");
        for(String countryNames : countries){
            if(countryNames.length()>=7){
                System.out.println(countryNames+ " " + countryNames.length());

            }
        }

        // TODO: 4/6/21 print first 2 country


    }
}
