import Driver.DriveLicense;
import Driver.PremiumCarsDriver;

import static Driver.DriveLicense.*;

public class Main {
    public static void main(String[] args) {

        PremiumCarsDriver JasonStatham = new PremiumCarsDriver(10, DriveLicense.B, 1122);
        JasonStatham.openAuto(1122); //открываем с верным ключом
        JasonStatham.openAuto(1111);//           с неверным ключом

        JasonStatham.drive(B); //проверка категории (true)
        JasonStatham.drive(A);                   // (false)


    }
}
