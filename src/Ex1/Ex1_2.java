package Ex1;

public class Ex1_2 {
    public static void main(String[] args) {
        String str = "Мама мыла раму";
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
