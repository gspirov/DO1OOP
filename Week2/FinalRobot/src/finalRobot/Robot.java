package finalRobot;

public class Robot {
    private static final int MIN = 0;
    private static final int MAX = 4;

    public static final String UP = "up";
    public static final String DOWN = "down";
    public static final String LEFT = "left";
    public static final String RIGHT = "right";

    private final String AXIS_X = "x";
    private final String AXIS_Y = "y";

    private final String[] directions = {UP, DOWN, LEFT, RIGHT};

    private int x;
    private int y;

    public Robot(int x, int y) {
        if (!isWithinBoundaries(x)) {
            throw new IllegalArgumentException("X out of boundaries.");
        }

        if (!isWithinBoundaries(y)) {
            throw new IllegalArgumentException("Y out of boundaries.");
        }

        this.x = x;
        this.y = y;
    }

    public boolean move(int distance, String direction) {
        if (distance < 1) {
            throw new IllegalArgumentException("Distance must be greater than zero.");
        }

        return switch (direction) {
            case UP -> this.moveAxis(AXIS_Y, distance, -1);
            case DOWN -> this.moveAxis(AXIS_Y, distance, +1);
            case LEFT -> this.moveAxis(AXIS_X, distance, -1);
            case RIGHT -> this.moveAxis(AXIS_X, distance, +1);
            default -> throw new IllegalArgumentException("Invalid direction.");
        };
    }

    private boolean moveAxis(String axis, int distance, int sign) {
        // X
        if (axis.equals(AXIS_X)) {
            int newValue = this.x + sign * distance;

            if (!isWithinBoundaries(newValue)) {
                return false;
            }

            this.x = newValue;
            return true;
        }

        // Y
        int newValue = this.y + sign * distance;

        if (!isWithinBoundaries(newValue)) {
            return false;
        }

        this.y = newValue;
        return true;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private boolean isWithinBoundaries(int distance) {
        return distance >= MIN && distance <= MAX;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
