package robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.printPosition();

        robot.moveUp();
        robot.printPosition();

        robot.moveLeft();
        robot.printPosition();

        robot.moveDown();
        robot.printPosition();

        robot.moveRight();
        robot.printPosition();
    }
}
