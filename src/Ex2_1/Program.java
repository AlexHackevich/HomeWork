package Ex2_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        String str1 = "Мой номер телефона +375-29-1234567. Мой ник в телеграмм @TheGodFather.";

        String phoneRegex = "(?:\\+375[- ]?(?:25|44)[- ]?)?(\\d{7})";
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(str1);
        while (phoneMatcher.find())
            System.out.println(phoneMatcher.group());

        String telegramRegex = "(?<=@)\\w+";
        Pattern telegramPattern = Pattern.compile(telegramRegex);
        Matcher telegramMatcher = telegramPattern.matcher(str1);
        while (telegramMatcher.find())
            System.out.println(telegramMatcher.group());

    }
}
