package IQQUESTIONPreperation;

public class _6_RemoveDuplicate_with_method {
    public static void main(String[] args) {
        System.out.println(setUp("AAAABBBCCCDDDEE"));

    }
    public static String setUp(String word){
        String removeDuplicate = "";
        for (int i = 0; i < word.length(); i++) {
            if (!removeDuplicate.contains(word.charAt(i)+"")){
                removeDuplicate+=word.charAt(i);
            }
        }
        return removeDuplicate;
    }
}
