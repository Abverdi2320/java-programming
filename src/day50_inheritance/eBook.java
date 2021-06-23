package day50_inheritance;

public class eBook extends Book{
    int size;
    int page;
    public void readBook(){
        System.out.println("eBook can readable");
        System.out.println("Title =" +title);
        System.out.println("Author = " +author);
        System.out.println("Size = " +size);
        System.out.println("Pages = " +page);
    }
}
