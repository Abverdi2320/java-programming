package day08_casting_scanner;

public class CastingExamples {
    public static void main (String[] args){
        //byte - short-int-long
        
        byte num1 = 100;
        short num2 = num1;
        int num3 = 100;
        long num4 = num3;
        //float - double
        float num6 = 124.4f;
        double num7 = num6;
        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);


        int i1 = 55;
        byte b2 = (byte) i1;


        long l3 = 4444l;
        int i3 = (int) l3;
        System.out.println("=====================");

        int num10 = 22;
        byte num11 = (byte) num10;
        short num12 = (short) num10;
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);


        double num13 = 55.3;
        float num14 = (float) num13;

        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);
        
        
        double num15 = 1234.6;
        int num16 = (int) num15;

        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);
        
        int num17 = 300;
        byte num18 = (byte)num17;

        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);
        
        char letter = 'A';
        int numletter = letter;

        System.out.println("letter = " + letter);
        System.out.println("numletter = " + numletter);

        char ch= 'J';
        int num20 = ch;
        System.out.println(num20 );
        System.out.println();






    }
}
