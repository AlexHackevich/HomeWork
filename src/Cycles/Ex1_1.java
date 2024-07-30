package Cycles;

public class Ex1_1 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                result = i * j;
                System.out.printf("%4d", result);
            }
            System.out.println();
        }
    }
}
