package IQTasks;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*
        Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC
         */

        System.out.println(removeDup("AAABBBCCC"));
    }

    public static String removeDup(String str1) {
        String result ="";
        for (int i = 0; i < str1.length(); i++) {
            if (!result.contains(str1.charAt(i)+"")){
                result+=str1.charAt(i);
            }
        }
        return result;

    }
}
