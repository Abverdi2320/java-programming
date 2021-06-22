package day22_string_manipulation;



public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13,18));
        System.out.println(result.substring(13));

        //find the index of:
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));



        //now we can combine them into 1 statement
        System.out.println(result.substring(result.indexOf(":")));


        String today = "i coded [orange cat] today";
        int first = today.indexOf("[");
        int second = today.indexOf("]");
        System.out.println(today.substring(first+1 ,second));







    }
}
