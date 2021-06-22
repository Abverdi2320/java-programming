package Reviews;

public class taskRev {
    public static void main(String[] args) {
        String str = "Hello Today you are great looking Peter how are you ";

        int index = str.indexOf("you");
        System.out.println(index);
        int index2 = str.indexOf("how");
        System.out.println(index2);
        System.out.println(str.substring(index,index2));

    }
}
