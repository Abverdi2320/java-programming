package Practice;

public class vowels {
    public static void main(String[] args) {
        String word = "Abbas Verdiyev";
        String cont = "";

        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e'||word.charAt(i)=='i'|| word.charAt(i)=='o'||word.charAt(i) == 'u'){
                cont+=word.charAt(i);
            }
        }
        System.out.println("cont = " + cont);


    }
}
