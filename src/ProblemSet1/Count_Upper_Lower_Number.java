package ProblemSet1;

public class Count_Upper_Lower_Number {
    public static void main(String[] args) {
        String word = "2juMp41EEkd4s4";
        int upperCase = 0;
        int lower = 0;
        int number = 0;
        for (int i = 0; i < word.length(); i++) {
            char any = word.charAt(i);
            if (any >= 'a' && any <= 'z'){
                lower++;
            }else if (any>= 'A' && any<='Z'){
                upperCase++;
            }else if(any>= '0' && any <= '9' ){
                number++;
            }

        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lower = " + lower);
        System.out.println("number = " + number);
    }
}
