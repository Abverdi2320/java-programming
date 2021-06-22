package Reviews;

public class MoveFirstWord {
    public static void main(String[] args) {
        String sentence = "hello world how are you today";
        int index = sentence.indexOf("how");
        String a = sentence.substring(index);
        String b = sentence.substring(0,index);
        System.out.println(a+" "+b);

    }
}
