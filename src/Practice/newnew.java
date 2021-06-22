package Practice;

import java.util.Arrays;

public class newnew {
    public static void main(String[] args) {
        String sentence = "i love java java is fun";
        String[] any = sentence.split(" ");
        for (int i = 0; i < any.length; i++) {
            String cont = "";
            for (int j = any[i].length()-1; j >= 0 ; j--) {
                cont+=any[i].charAt(j);
            }
            System.out.println("cont = " + cont);
        }
    }
}
