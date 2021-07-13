package IQQUESTIONPreperation;

public class _18_ReverseSecondWord {
    public static void main(String[] args) {
      String sentence = "I love java";
      String [] splitSentence = sentence.split(" ");
      String reverse = "";

        for (int i = splitSentence[2].length()-1; i >= 0 ; i--) {
            reverse += splitSentence[2].charAt(i);
        }
        splitSentence[2]=reverse;
        String result = "";
        for (String each : splitSentence) {
            result+=each+ " ";
        }
        System.out.println("result = " + result);
    }
}

