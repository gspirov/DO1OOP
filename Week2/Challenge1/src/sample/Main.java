package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf(
            "What's your current position (between %d and %d)?",
            Player.LOWER_THRESHOLD,
            Player.UPPER_THRESHOLD
        );

        Scanner sc = new Scanner(System.in);

        int currentPosition = sc.nextInt();

        if (currentPosition < Player.LOWER_THRESHOLD || currentPosition > Player.UPPER_THRESHOLD) {
            System.out.println("Invalid position.");
            return;
        }

        Player player = new Player(currentPosition);

        System.out.println("How many times to move forward?");

        int movesForward = sc.nextInt();
        int lastPositionBeforeMove = player.getPosition();

        for (int i = 0; i < movesForward; i++) {
            player.moveForward();
        }

        System.out.printf(
            "Position after moving forward %d.",
            player.getPosition()
        );
        System.out.println();

        int allowedForwardMoves = Player.UPPER_THRESHOLD - lastPositionBeforeMove;
        int extraForwardMoves = Math.max(0, movesForward - allowedForwardMoves);

        if (extraForwardMoves > 0) {
            System.out.printf(
                "You tried to move forward %d extra time/s which was not allowed.",
                extraForwardMoves
            );
            System.out.println();
        }

        System.out.println("How many times moving backward?");
        int movesBackward = sc.nextInt();
        lastPositionBeforeMove = player.getPosition();

        for (int i = 0; i < movesBackward; i++) {
            player.moveBackward();
        }

        System.out.printf(
            "Position after moving backward %d.",
            player.getPosition()
        );
        System.out.println();

        int allowedBackwardMoves = lastPositionBeforeMove - Player.LOWER_THRESHOLD;
        int extraBackwardMoves = Math.max(0, movesBackward - allowedBackwardMoves);

        if (extraBackwardMoves > 0) {
            System.out.printf(
                "You tried to move backward %d extra time/s which was not allowed.",
                extraBackwardMoves
            );
            System.out.println();
        }

        sc.close();
    }
}
