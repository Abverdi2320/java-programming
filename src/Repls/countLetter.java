package Repls;

public class countLetter {
    public static void main(String[] args) {
        String word = "aaabbcdd";
        String output = "";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            //i: aaabbcdd ==> outer loop
            //j: aaabbcdd ==> inner loop
            count=0;
            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }

            }
            output+=""+count+word.charAt(i);

            word=word.replace(""+word.charAt(i),"");

        }
        System.out.println(output);

    }



}
