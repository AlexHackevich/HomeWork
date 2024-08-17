package Ex1;

public class Ex1_1 {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2 =  "Мама" + " мыла " + "раму";

        String str3 = new String("Мама мыла раму");
        String str4 = new String("Мама" + " мыла " + "раму");

        System.out.println(str1==str2);
        System.out.println(str3==str4);
    }
}
