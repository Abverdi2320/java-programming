package Practice;

public class ShoppingList {
    public static void main(String[] args) {
        String word = "javaxjava";
        int count = 0;
        for (int i = 0; i<word.length(); i++){
            if(word.contains("java")){
                count++;
                word=word.replaceFirst("java","");

            }
        }
        System.out.println(count);



    }
}
