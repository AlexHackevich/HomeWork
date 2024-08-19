package Ex2_2;

public class SimpleBookTextSearch implements Findable {


    @Override
    public int countWord(String word, String text) {
        int count=0;
        for (int index = text.indexOf(word);
             index >= 0;
             index = text.indexOf(word, index + 1)) {
            count++;
        }
        return count;
    }
}
