package Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            try {
                array[i] = scanner.nextInt();
                count = 0;
            } catch (Exception e) {
                System.out.println("Ошибка: введите число типа int");
                count++;
                i--;
                scanner.nextLine();
            } finally {
                if (count >= 3) {
                    System.out.println( "3 неверных попытки!");
                    scanner.close();
                }
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i : array) {
            arrlist.add(i);
        }
        arrlist.stream().sorted().forEach(System.out::print);
    }
}