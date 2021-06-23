package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
    }

    public static void openBrowser() {
        System.out.println("Google Chrome");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("www.Etsy.com");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("search = Wooden Spoon ");

    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("33,603 results,\n" +
                "with Ads\n" +
                "Learn more\n" +
                "\n" +
                "\n");
    }
}
