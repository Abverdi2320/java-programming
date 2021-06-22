package day44_custom_sclasses;

public class App { // our class
        /**
         * App class is used as a template for App objects
         * We are describing app properties and behaviours here.Objects will be able to use them
         */


        String name ; //null by default
        double version ; //0.0 by default
        public void open(){
                System.out.println("Opening " + name+" app - version = " + version);// behaviour
        }
}
