package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book newBook = new Book();
        newBook.title= "Java intro";
        newBook.author = "Savitch";
        newBook.type = "Programming ";
        newBook.price = 85.0;

        System.out.println(newBook.title);
        System.out.println(newBook.author);
        System.out.println(newBook.type);
        System.out.println(newBook.price);

        audioBook book2 = new audioBook();
        book2.author= "Unmesh";
        book2.length= 60;
        book2.narrator = "Irina";
        book2.price = 51;
        book2.title = "Selenium CookBook";
        book2.type = "Automation";
        book2.listen();


        eBook eBook = new eBook();
        eBook.author= "Savitch";
        eBook.price = 51;
        eBook.title = "Java data structures";
        eBook.type = "Programming";
        eBook.size = 2;
        eBook.page = 1000;
        eBook.readBook();



    }
}
