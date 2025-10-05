package finalRobot;

public class Main {
    public static void main(String[] args) {
        Robot r = new Robot(3,1);
        r.move(1, Robot.DOWN);
        r.move(1, Robot.DOWN);
        System.out.println(r);
    }
}
