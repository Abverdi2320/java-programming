package day61_exceptions_collections;

public class ElementaryStudentTests {
    public static void main(String[] args) {
        try{
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Abbas");
            el1.setAge(1);
            System.out.println(el1.toString());
        }catch (Exception e){
            e.printStackTrace(); // print the error stacktrace and continue
        }




        System.out.println("--- EXECUTION COMPLETED ---");
    }
}
