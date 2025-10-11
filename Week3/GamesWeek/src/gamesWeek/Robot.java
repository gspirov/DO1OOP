package gamesWeek;

public class Robot {
    private static final int MIN = 0;
    private static final int MAX = 4;

    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;

    private final String AXIS_X = "x";
    private final String AXIS_Y = "y";

    private int x = 2;
    private int y = 1;

    public boolean move(int direction) {
        return switch (direction) {
            case UP -> this.moveAxis(AXIS_Y, -1);
            case DOWN -> this.moveAxis(AXIS_Y, +1);
            case LEFT -> this.moveAxis(AXIS_X, -1);
            case RIGHT -> this.moveAxis(AXIS_X, +1);
            default -> throw new IllegalArgumentException("Invalid direction.");
        };
    }

    private boolean moveAxis(String axis, int sign) {
        // X
        if (axis.equals(AXIS_X)) {
            int newValue = this.x + sign;

            if (!isWithinBoundaries(newValue)) {
                return false;
            }

            this.x = newValue;
            return true;
        }

        // Y
        int newValue = this.y + sign;

        if (!isWithinBoundaries(newValue)) {
            return false;
        }

        this.y = newValue;
        return true;
    }

    private boolean isWithinBoundaries(int distance) {
        return distance >= MIN && distance <= MAX;
    }

    @Override
    public String toString() {
        return "Robot's current position: {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
