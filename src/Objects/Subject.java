package Objects;

public class Subject {
    private String nameOfTheDiscipline;
    private int numberOfHours;
    private float timeToStudy;

    public Subject(String nameOfTheDiscipline, int numberOfHours, float timeToStudy) {
        this.nameOfTheDiscipline = nameOfTheDiscipline;
        this.numberOfHours = numberOfHours;
        this.timeToStudy = timeToStudy;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameOfTheDiscipline='" + nameOfTheDiscipline + '\'' +
                ", numberOfHours=" + numberOfHours +
                ", timeToStudy=" + timeToStudy +
                '}';
    }
}
