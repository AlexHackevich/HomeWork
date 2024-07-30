package Objects;

public class Teacher {
    private String name;
    private int yearsOfExperience;
    private int classroom;

    public Teacher(int classroom, String name, int yearsOfExperience) {
        this.classroom = classroom;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "classroom=" + classroom +
                ", name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
