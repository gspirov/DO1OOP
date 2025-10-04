package robotReturns;

public class Robot {
	private int x;
	private int y;

    public Robot(int startX, int startY) {
        x = startX;
        y = startY;
    }

    public Robot() {
        this.x = 2;
        this.y = 1;
    }

	public boolean moveUp(int distance) {
		// Check that the distance is a positive value
		if (distance > 0) {
			// Check that the move won't take the robot above the top of the grid
			if (y - distance >= 0) {
				// Move the robot up the specified distance
				y -= distance;
				// Return true to indicate a valid move was made, thus ending the method
				return true;
			}
		}
		// This is only reached if true hasn't been returned, meaning we should return false
		// The move would have been invalid, and hasn't been made
		return false;
	}

	public boolean moveRight(int distance) {
		if (distance > 0) {
			if (x + distance <= 4) {
				x += distance;
				return true;
			}
		}
		return false;

	}

	public boolean moveDown(int distance) {
		if (distance > 0) {
			if (y + distance <= 4) {
				y += distance;
				return true;
			}
		}
		return false;
	}

	public boolean moveLeft(int distance) {
		if (distance > 0) {
			if (x - distance >= 0) {
				x -= distance;
				return true;
			}
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
