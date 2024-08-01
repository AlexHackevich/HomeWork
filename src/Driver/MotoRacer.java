package Driver;

public class MotoRacer extends Driver{
    private boolean isBiker;
    public MotoRacer(DriveLicense driveLicense, int drivingExpiriense) {
        super(driveLicense, drivingExpiriense);
    }
    public MotoRacer(int drivingExpiriense) {
        super(drivingExpiriense);
    }
public void biker(){
        if(getDrivingExpiriense()>=2){
            isBiker = true;
            System.out.println(isBiker);
        }else {
            System.out.println("You're not a biker");
        }
}
    @Override
    public boolean drive(DriveLicense driveLicenses) {
            if (driveLicenses == DriveLicense.A) {
                System.out.println("The motoRacer can drive");
            } else {
                System.out.println("The motoRacer cant drive");
            }
            return false;
    }
    @Override
    public boolean openVehicle(int key) {
        System.out.println("This key "+key+ " "+ "will start the motocycle");
        return true;
    }

}
