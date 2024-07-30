package Objects;

public class Student {
    private String name;
    private int course;
    private float mark;

    public Student(int course, float mark, String name) {
        this.course = course;
        this.mark = mark;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
