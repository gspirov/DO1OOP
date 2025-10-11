package gamesWeek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Robot robot = new Robot();
        System.out.println(robot);

        while (true) {
            System.out.println("Menu:");
            System.out.println("0. EXIT");
            System.out.println(Robot.UP + ". UP");
            System.out.println(Robot.DOWN + ". DOWN");
            System.out.println(Robot.LEFT + ". LEFT");
            System.out.println(Robot.RIGHT + ". RIGHT");
            System.out.print("Enter your direction (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number between 0 and 4.");
                scanner.next();
                continue;
            }

            int direction = scanner.nextInt();

            if (direction == 0) {
                System.out.println("Bye.");
                break;
            }

            try {
                if (!robot.move(direction)) {
                    System.out.println("Move not allowed.");
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            } finally {
                System.out.println(robot);
            }
        }
    }
}
