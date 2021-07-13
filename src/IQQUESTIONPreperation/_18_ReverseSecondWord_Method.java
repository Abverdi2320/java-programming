package IQQUESTIONPreperation;

public class _18_ReverseSecondWord_Method {
    public static void main(String[] args) {
        String sentence = "I love java";
        String [] splitSentence = sentence.split(" ");
        System.out.println(setUp(splitSentence));

    }
    public static String setUp(String[] word){
        String reverse = "";
        for (int i = word[2].length()-1; i >=0 ; i--) {
            reverse+=word[2].charAt(i);
        }
        word[2]=reverse;
        String result = "";

        for (String each : word) {
            result+=each+" ";
        }
        return result;
    }
}
