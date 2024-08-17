package Ex2_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBookTextSearch implements Findable {
    int count1=0;
    @Override
    public int countWord(String word, String text) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count1++;
        }
        System.out.println(count1);
        return 0;
    }
}