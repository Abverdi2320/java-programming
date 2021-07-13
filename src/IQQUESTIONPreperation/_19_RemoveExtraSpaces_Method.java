package IQQUESTIONPreperation;

public class _19_RemoveExtraSpaces_Method {
    public static void main(String[] args) {
        String sentence = "I    WENT   TO   SHOPPING ";
        String [] arr = sentence.trim().split(" ");
        System.out.println(setUp(arr));

    }
    public static String setUp(String[] word){
        String result = "";
        for (String each : word) {
            if (!each.isEmpty()){
                result+=each+" ";

            }
        }
        return result;

    }
}
