package IQQUESTIONPreperation;

public class _12_HideSinglePassword_with_method {
    public static void main(String[] args) {
        String password = "Pineapple";
        System.out.println(setUp(password));

    }
    public static String setUp(String word){
        String hide = "";

        for (int i = 0; i < word.length(); i++) {
            hide+="*";
        }
        return hide;
    }
}
