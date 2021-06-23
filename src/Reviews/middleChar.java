package Reviews;

public class middleChar {
    public static void main(String[] args) {
        String word = "elephant";

        if (word.length() %2 == 0) {
            char ch = word.charAt(word.length() / 2-1);
            char ch2 = word.charAt(word.length() / 2);
            System.out.print(ch+""+ch2);
        }
        if(word.length()%2!=0){
            char ch = word.charAt(word.length() / 2);
            System.out.println(ch);
        }
    }
}