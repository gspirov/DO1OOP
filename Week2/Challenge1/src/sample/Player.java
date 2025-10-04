package sample;

public class Player {
    public static final int UPPER_THRESHOLD = 5;
    public static final int LOWER_THRESHOLD = -5;

    private int position;

    public Player(int position) {
        this.position = position;
    }

    public void moveForward() {
        if (this.position < UPPER_THRESHOLD) {
            this.position++;
        }
    }

    public void moveBackward() {
        if (this.position > LOWER_THRESHOLD) {
            this.position--;
        }
    }

    public int getPosition() {
        return position;
    }
}
