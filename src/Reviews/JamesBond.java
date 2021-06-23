package Reviews;

public class JamesBond {
    public static void main(String[] args) {
        String fullName = "james bond";
        String firstLetter = fullName.substring(0,1).toUpperCase();
        int index = fullName.indexOf(" ");
        System.out.println(firstLetter+fullName.substring(index+1,index+2).toUpperCase());





    }
}
