package robotParameters;

public class Robot {
    private static final int MIN = 0;
    private static final int MAX = 4;

	private int x = 2;
	private int y = 1;
	
	public void moveUp(int distance) {
		if (distance > 0 && (this.y - distance) >= MIN) {
			y = y - distance;
		}
	}
	
	public void moveDown(int distance) {
		if (distance > 0 && (this.y + distance) <= MAX) {
			y += 1;
		}		
	}
	
	public void moveLeft(int distance) {
		if (distance > 0 && (this.x - distance) >= MIN) {
			x = x - distance;
		}		
	}
	
	public void moveRight(int distance) {
        if (distance > 0 && (this.x + distance) <= MAX) {
            x = x + distance;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

