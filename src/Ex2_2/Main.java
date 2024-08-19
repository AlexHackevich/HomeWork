package Ex2_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = null;
        try {
            Path path = Paths.get("src/Ex2_2/Война и мир.txt");
            text = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Input word: ");
        String word = in.nextLine();

        Findable simple = new SimpleBookTextSearch();
        int resultSimpleSearch = simple.countWord(word, text);
        System.out.println(resultSimpleSearch);

        Findable regex = new RegexBookTextSearch();
        int resultRegexSearch = regex.countWord(word, text);
        System.out.println(resultRegexSearch);

    }
}
