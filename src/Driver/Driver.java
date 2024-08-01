package Driver;

import Interfaces.Driveable;
import Interfaces.Openable;
import Interfaces.Refueable;

public abstract class Driver implements Openable, Driveable, Refueable {
    private int drivingExpiriense;
    private DriveLicense driveLicense;

    public Driver(DriveLicense driveLicense, int drivingExpiriense) {
        this.driveLicense = driveLicense;
        this.drivingExpiriense = drivingExpiriense;
    }


    public Driver(int drivingExpiriense) {
        this.drivingExpiriense = drivingExpiriense;
    }

    public int getDrivingExpiriense() {
        return drivingExpiriense;
    }

}
