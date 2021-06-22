package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 3, '|'));
        System.out.println(repeatString("I CAN DO IT!",10,'-'));
    }

    public static String repeatString(String word, int times, char delimeter) {
        String returnValue = "";
        for (int i = 1; i <= times; i++) {
            //take care of last delimiter
            if (i == times) { //if last iteration
                returnValue += word;//add only word by itself
            } else {
                returnValue += word + delimeter;//add with delimiter
            }


        }
        return returnValue;
    }
}
