package Driver;

import Interfaces.Driveable;
import Interfaces.Openable;

public abstract class Driver implements Openable, Driveable {
    private int drivingExpiriense;
    private DriveLicense driveLicense;

    public DriveLicense getDriveLicense() {
        return driveLicense;
    }
    public Driver(DriveLicense driveLicense) {
        this.driveLicense = driveLicense;
    }

    public DriveLicense[] getLicense() {
        return license;
    }
    private DriveLicense[] license;
    public Driver(int drivingExpiriense) {
        this.drivingExpiriense = drivingExpiriense;
    }

    public int getDrivingExpiriense() {
        return drivingExpiriense;
    }

}
