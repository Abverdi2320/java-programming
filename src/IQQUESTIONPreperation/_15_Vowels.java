package IQQUESTIONPreperation;

public class _15_Vowels {
    public static void main(String[] args) {
        String name = "elvin ismaliyov";
        String vowels = "";

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='o'||name.charAt(i)=='u'||name.charAt(i)=='i'){
                vowels+=name.charAt(i);
            }
        }
        System.out.println("vowels = " + vowels);

    }


}
