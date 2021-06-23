package Reviews;

public class Rev {
    public static void main(String[] args) {
        //str.length returns the  length of string
        //indexOf() -- accepts char but returns int
        String str = "Haello";
        int index = str.indexOf('o');
        System.out.println(index);

        //contains() -- ACCEPTS STRING RETURN BOOLEAN
        String given = "a";
  //      boolean check = str.contains(given);
    //    System.out.println(check);

        /*
          if (str.indexOf(given)>-1){
            System.out.println(true);
            System.out.println(str.indexOf(given));
        }else{
            System.out.println(false);
        }

         */


        /*
            String str2 = "Hello world";
        if (str2.length()>0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
         */

        /*

         String str3 = "java is fun";
        int indexx = str3.indexOf("s");
        System.out.println(indexx);

        char  ch = str3.charAt(indexx);
        System.out.println(ch);


         */

        String any = "Cybertek school";
        String result = "";
        for (int i = 0; i < any.length(); i++) {
            char ch = any.charAt(i);
            if (ch == 'e' || ch == 'o'){
                if (!result.contains(String.valueOf(ch))){
                    result+=ch;
                }
            }
        }
        System.out.println(result);





    }
}
