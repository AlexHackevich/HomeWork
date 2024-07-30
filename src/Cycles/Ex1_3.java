package Cycles;

import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        int product = 1;
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        System.out.println("Product: " + product);
    }
}
