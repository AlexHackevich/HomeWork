package Ex2_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBookTextSearch implements Findable {


    @Override
    public int countWord(String word, String text) {
        int count1 =0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count1++;
        }
        return count1;
    }
}