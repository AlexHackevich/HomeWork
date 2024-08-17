package Ex2_2;

import java.util.Scanner;

public class SimpleBookTextSearch implements Findable{
    private int count;
    @Override
    public int countWord(String word, String text) {
        for (int index = text.indexOf(word);
             index >= 0;
             index = text.indexOf(word, index + 1)) {
            count++;
        }
        System.out.println(count);
        return count;
    }
}
