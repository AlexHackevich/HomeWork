package Vehicles;

public class Wheels {
    private int diameter;
    private SeasonTyre seasonTyre;
    private String nameTyre;

    public Wheels(int diameter, String nameTyre, SeasonTyre seasonTyre) {
        this.diameter = diameter;
        this.nameTyre = nameTyre;
        this.seasonTyre = seasonTyre;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "diameter=" + diameter +
                ", seasonTyre=" + seasonTyre +
                ", nameTyre='" + nameTyre + '\'' +
                '}';
    }
}
