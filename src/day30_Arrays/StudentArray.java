package day30_Arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = {"ID2233", "Abbas", "Verdi", "Batch22", "1234567"};
        System.out.println("Student ID = " + student1[0]);
        System.out.println("Student First Name  = " + student1[1]);
        System.out.println("Student Last Name = " + student1[2]);
        System.out.println("Student1 Batch Number = " + student1[3]);
        System.out.println("Student1 Phone Number = " + student1[4]);

        System.out.println("Student data length = " + student1.length);

        //check if student1 data array contains 5 items.
        //true: Student1 data array has correct length
        //false: data array has  incorrect length

        if (student1.length == 5) {
            System.out.println("Pass: Student1 data array has correct length");
        } else {
            System.out.println("Fail: data array has  incorrect length");
        }

        System.out.println(student1[1].toUpperCase()+ " " + student1[2].toUpperCase());

        String mobileNum = student1[5];
        System.out.println(mobileNum.length());
    }
}
