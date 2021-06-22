package day39_wrapper_classes;



public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "334455";
        double price = Double.parseDouble(strPrice);
        System.out.println("price = " + price);


        String pet = "47";
        byte byt = Byte.parseByte(pet);
        System.out.println("byt = " + byt);


        String sentence = "I wrote 100 lines of code";
        //Split by space, parse index 2 to int
        String[] words = sentence.split(" ");
        int linesOfCodes = Integer.parseInt(words[2]);
        System.out.println("linesOfCodes = " + linesOfCodes);


    }

}
