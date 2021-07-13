package IQQUESTIONPreperation;

public class _19_removeExtraSpaces {
    public static void main(String[] args) {
       String sentence = "I   went   to   play    soccer    with,  top   dasiyan";
       String [] splitSentence = sentence.trim().split(" ");
       String result = "";

        for (String each : splitSentence) {
            if (!each.isEmpty()){
                result+=each+ " ";
            }
        }
        System.out.println("result = " + result);
    }
}

