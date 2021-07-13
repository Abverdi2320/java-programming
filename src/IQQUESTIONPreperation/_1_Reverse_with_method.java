package IQQUESTIONPreperation;

public class _1_Reverse_with_method {
    public static void main(String[] args) {
        System.out.println(setUp("apple"));

    }
    public static String setUp(String word){
        String reverse ="";
        for (int i = word.length()-1; i >=0; i--) {
            reverse+=word.charAt(i);
        }
        return reverse;
    }

}
