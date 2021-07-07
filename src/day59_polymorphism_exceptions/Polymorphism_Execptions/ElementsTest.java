package day59_polymorphism_exceptions.Polymorphism_Execptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("Hi");
        link.getLinkHref();


        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        //loginLing.getLinkHref(); = ERROR

        WebElement username = new InputField();
        username.sendKeys("Wooden Spoon");
        username.click();
    }
}
