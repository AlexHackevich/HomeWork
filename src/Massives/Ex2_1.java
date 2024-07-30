package Massives;

public class Ex2_1 {
    public static void main(String[] args) {
        double[] mass = {12.3, 90.5, 4, 88, Math.PI};
        do {   //do while
            for (int i = 0; i < mass.length; i++) {
                System.out.println(mass[i]);
            }
            System.out.println();
        } while (false);
        int i = 0;
        while (i < mass.length) { //while
            System.out.println(mass[i++]);
        }
        System.out.println();
        for (int j = 0; j < mass.length; j++) {  //for
            System.out.println(mass[j]);
        }
        System.out.println();
        for (double k : mass) {
            System.out.println(k);
        }
    }
}
