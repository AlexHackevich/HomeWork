import Driver.DriveLicense;
import Driver.MotoRacer;
import Driver.PremiumCarsDriver;
import Moto.YamahaTTR250;
import Vehicles.*;

import static Driver.DriveLicense.*;

public class Main {
    public static void main(String[] args) {

        PremiumCarsDriver JasonStatham = new PremiumCarsDriver(10, DriveLicense.B, 1122);

        JasonStatham.openVehicle(1122);
        JasonStatham.openVehicle(1111);

        JasonStatham.drive(B);
        JasonStatham.drive(A);

        JasonStatham.refuel();

        MersedesW223 mbW223 = new MersedesW223(new Engine(FuelType.AI98, "M176", 4.0f),
                3, new Wheels(21, "Michelin", SeasonTyre.SUMMER));

        mbW223.seets(3);

        YamahaTTR250 yamahaTTR250 = new YamahaTTR250(new Engine(FuelType.AI95, "TTR",
                0.25f), 2, new Wheels(16, "Pirelli", SeasonTyre.ALLSEASON));
        yamahaTTR250.seets(3);

        MotoRacer motoRacer = new MotoRacer(A,3);
        motoRacer.biker();
        motoRacer.openVehicle(1234);
        motoRacer.drive(A);
        motoRacer.refuel();

    }
}
