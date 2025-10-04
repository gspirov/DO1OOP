package student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.addCredits(10);
        student.addCredits(20);
        System.out.println(student);
    }
}
