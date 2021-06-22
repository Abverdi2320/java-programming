package Reviews;

public class charAt {
    public static void main(String[] args) {
        String str = "Cybertek school";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'e' || ch == 'o') {
                if (!result.contains(String.valueOf(ch))) {
                    result += ch;
                }
            }
        }
        System.out.println(result);
    }
}