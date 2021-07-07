package IQQUESTIONPreperation;

public class _14_FindUnique {
    public static void main(String[] args) {
        String word = "AABBBBCCCCDDDEEEP";
        String unique = "";


        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                unique += word.charAt(i);
            }
        }

        System.out.println("unique = " + unique);


    }
}
