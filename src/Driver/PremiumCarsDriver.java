package Driver;

public class PremiumCarsDriver extends Driver {
    private int karKey;

    public PremiumCarsDriver(int drivingExpiriense, DriveLicense license, int karKey) {
        super(drivingExpiriense);
        this.karKey = karKey;
    }

    public int getKarKey() {
        return karKey;
    }

    @Override
    public boolean openVehicle(int key) {
        if (key == getKarKey()) {
            System.out.println("Саr opened");
            return true;
        } else {
            System.out.println("Car not opened");
        }
        return false;
    }

    @Override
    public boolean drive(DriveLicense driveLicenses) {
        if (driveLicenses == DriveLicense.B) {
            System.out.println("The driver can drive");
        } else {
            System.out.println("The driver cant drive");
        }
        return false;
    }

}


