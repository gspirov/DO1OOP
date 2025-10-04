package robot;

public class Robot {
    private static final int MIN = 0;
    private static final int MAX = 4;

    private int x = 2;
    private int y = 1;

    public void moveUp() {
        if (y > MIN) {
            y--;
        }
    }

    public void moveDown() {
        if (y < MAX) {
            y++;
        }
    }

    public void moveLeft() {
        if (x > MIN) {
            x--;
        }
    }

    public void moveRight() {
        if (x < MAX) {
            x++;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void printPosition() {
        System.out.printf("Robot is at position (%d, %d)%n", x, y);
    }
}