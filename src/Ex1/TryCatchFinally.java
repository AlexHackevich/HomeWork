package Ex1;

public class TryCatchFinally {
    public static void main(String[] args) {

        TryCatchFinally situation = new TryCatchFinally();
//TryCatch
        try {
            situation.devide(10);
        } catch (Exception e) {
            System.out.println("Ошибка! Деление на 0" + e.getMessage());
        }
//TryCatchFinally
        try {
            situation.devide(10);
        } catch (Exception e) {
            System.out.println("Перехватываем ошибку");
        } finally {
            System.out.println("Там все равно будет 0");
        }
//TryFinally
        try {
            situation.devide(10);
        } finally {
            System.out.println("Ошибка не перехвачена:");
        }
    }

    public int devide(int a) throws ArithmeticException {
        int c = a / 0;
        return c;
    }
}