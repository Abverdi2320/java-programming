package IQTasks;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }
    public static String reverse(String str) {
        String any = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            any += str.toCharArray()[i];
        }
        return any;
    }
}


