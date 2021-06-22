package IQTasks;

public class sumOfDIgits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit("11125"));

    }
    public static int sumOfDigit(String s){
         int count = 0;
         char[] ch = s.toCharArray();
         for (char each : ch){
             if (Character.isDigit(each)){
                 count+=Integer.valueOf(""+each);
             }
         }
         return count;
    }
}
