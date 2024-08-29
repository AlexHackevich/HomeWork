package Ex2;

public class Main {
    public static void main(String[] args) throws FileNotRead, ExceptionIOErr {
        Ex2_1 test1 = new Ex2_1();
        test1.readfile("src/Ex2/dock");
        // test1.readfile("src/Ex2/dock111");

        Ex2_2 test2 = new Ex2_2();
        test2.readfile("src/Ex2/dock");

        //test2.readfile("src/Ex2/dock111");
    }
}
