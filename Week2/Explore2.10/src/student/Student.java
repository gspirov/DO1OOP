package student;

public class Student {
    private int credits;

    public void addCredits(int credits) {
        this.credits += credits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "credits=" + credits +
                '}';
    }
}
