package day61_exceptions_collections.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) {

        String filePath = "src/day61_exceptions_collections/checked_exceptions/data.txt";
        try {
            List<String> data = Files.readAllLines(Paths.get(filePath));
            System.out.println("First line = " +data.get(0));
            for (String each : data) {
                System.out.println(each);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("--- THE END ---");
    }
}
