package inheritance;

public class Circle extends Shape {
	private final double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public double getWidth()  { return radius * 2; }
	public double getHeight() { return radius * 2; }

    @Override
	public void draw(GraphicsContextWrapper gc) {
		gc.oval(x - radius, y - radius, radius * 2, radius * 2);
	}

	public double getRadius() { return radius; }
}
