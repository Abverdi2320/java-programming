package day26_loops;


public class WeekDays {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i <= 10; i++) {
            switch (i) {
                case 1:
                    System.out.println(i + " = Monday");
                    break;
                case 2:
                    System.out.println(i + " = Tuesday");
                    break;
                case 3:
                    System.out.println(i + " = Wednesday");
                    break;
                case 4:
                    System.out.println(i + " = Thursday");
                    break;
                case 5:
                    System.out.println(i + " = Friday");
                    break;
                case 6:
                    System.out.println(i + " = Saturday");
                    break;
                case 7:
                    System.out.println(i+ " = Sunday");
                    break;
                case 8:
                default:
                    System.out.println(i+ " = No such day , its java day");
            }


            String  word  = "java";




        }
    }
}
