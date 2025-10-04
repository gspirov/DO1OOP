package robotReturns;

public class Robot {
    private static final int MIN = 0;
    private static final int MAX = 4;

    private int x = 2;
    private int y = 1;

    public boolean moveUp(int distance) {
        if (distance > 0 && (this.y - distance) >= MIN) {
            y = y - distance;
            return true;
        }

        return false;
    }

    public boolean moveDown(int distance) {
        if (distance > 0 && (this.y + distance) <= MAX) {
            y = y + distance;
            return true;
        }

        return false;
    }

    public boolean moveLeft(int distance) {
        if (distance > 0 && (this.x - distance) >= MIN) {
            x = x - distance;
            return true;
        }

        return false;
    }

    public boolean moveRight(int distance) {
        if (distance > 0 && (this.x + distance) <= MAX) {
            x = x + distance;
            return true;
        }

        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
