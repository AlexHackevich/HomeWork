import Driver.DriveLicense;
import Driver.PremiumCarsDriver;
import Vehicles.*;

import static Driver.DriveLicense.*;

public class Main {
    public static void main(String[] args) {

        PremiumCarsDriver JasonStatham = new PremiumCarsDriver(10, DriveLicense.B, 1122);

        JasonStatham.openAuto(1122); //открываем с верным ключом
        JasonStatham.openAuto(1111);//           с неверным ключом

        JasonStatham.drive(B); //проверка категории (true)
        JasonStatham.drive(A);                   // (false)

        MersedesW223 mbW223 = new MersedesW223(new Engine(FuelType.AI98,"M176",4.0f),
                3,new Wheels(21,"Michelin", SeasonTyre.SUMMER));

        mbW223.seets(3);
    }

}
