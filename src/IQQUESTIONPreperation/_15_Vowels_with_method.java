package IQQUESTIONPreperation;

public class _15_Vowels_with_method {
    public static void main(String[] args) {
        String fullName = "Abbas Verdiyev";
        System.out.println(setUp(fullName));

    }

    public static String setUp(String name) {
        String vowels = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'i') {
                vowels += name.charAt(i);
            }

        }
        return vowels;
    }
}
