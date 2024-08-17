package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Введите строки (введите 'exit' для завершения):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            strings.add(input);
        }
        String result = String.join(" ", strings);
        System.out.println("Результат: " + result);
        scanner.close();
    }
}