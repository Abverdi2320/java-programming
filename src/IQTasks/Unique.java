package IQTasks;

public class Unique {
    public static void main(String[] args) {
      String word = "AAABBBCCE";
      String any = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                any+=word.charAt(i);
            }
        }
        System.out.println(any);



    }
}
