package Objects;

public class Main {
    public static void main(String[] args) {
        Student hackevich = new Student(4,8.9f, "Alexander");
        Teacher shumilov = new Teacher(38,"Alexey", 4);
        Subject java = new Subject("JavaSE",2, 60.5f);
        Object[] massive ={hackevich, shumilov, java};
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
    }
}
