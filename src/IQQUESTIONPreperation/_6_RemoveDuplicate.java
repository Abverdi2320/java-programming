package IQQUESTIONPreperation;

public class _6_RemoveDuplicate {
    public static void main(String[] args) {
        String randomWords = "AAABBBCCDDD";
        String duplicate = "";

        for (int i = 0; i < randomWords.length(); i++) {
            if (!duplicate.contains(randomWords.charAt(i)+"")){
                duplicate+=randomWords.charAt(i);
            }
        }
        System.out.println("duplicate = " + duplicate);
    }
}