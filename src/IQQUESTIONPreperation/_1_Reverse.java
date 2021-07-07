package IQQUESTIONPreperation;

public class _1_Reverse {
    public static void main(String[] args) {
        String word = "apple";
        String reverse = "";
        for(int i = word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);

    }

}

