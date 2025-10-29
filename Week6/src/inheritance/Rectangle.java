package inheritance;

public class Rectangle extends ShapeWithDimensions {
    public Rectangle(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(GraphicsContextWrapper gc) {
        gc.rect(x, y, width, height);
	}
}
