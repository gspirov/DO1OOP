package player;

public class Player {
    private final int LOWER_THRESHOLD = 0;
    private final int UPPER_THRESHOLD = 10;

    private int position;

    Player(int position) throws Exception {
        if (position < LOWER_THRESHOLD || position > UPPER_THRESHOLD) {
            throw new Exception("Invalid position.");
        }

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
        return this.position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "position=" + position +
                '}';
    }
}
