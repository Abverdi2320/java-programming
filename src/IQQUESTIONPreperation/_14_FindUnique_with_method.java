package IQQUESTIONPreperation;

public class _14_FindUnique_with_method {
    public static void main(String[] args) {
        System.out.println(setUp("AAAABBBCCDDDE"));

    }
    public static String setUp(String word){
        String unique = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                unique+=word.charAt(i);
            }
        }
        return unique;
    }
}
