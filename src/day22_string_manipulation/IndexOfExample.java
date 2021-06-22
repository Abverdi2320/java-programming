package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(","));
        //last comma
        System.out.println(technologies.lastIndexOf(","));
        //for middle one we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("Java is at index " + indexOfJava);
        int idxOfCss = technologies.indexOf("css");
        System.out.println("Css is at index " + idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("Cucumber is at index" + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql"); // not present we assign -1
        System.out.println("Sql is at index  " + indexOfSql);
//java, html, css, selenium, testng, maven, cucumber
        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not found");
        }

    }
}
