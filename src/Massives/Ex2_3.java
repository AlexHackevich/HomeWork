package Massives;

public class Ex2_3 {
    public static void main(String[] args) {
        Object[] objects = {123, "Ivan", 905, null, "AlexeyShumilov:)"};
        Object o = null;
        for (int i = 0; i < objects.length; i++) {
            o = objects[i];
            if (o != null) {
                System.out.println(o);
            } else {
                break;
            }
        }
    }
}

