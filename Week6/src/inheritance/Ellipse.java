package inheritance;

public class Ellipse extends ShapeWithDimensions {
    public Ellipse(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(GraphicsContextWrapper gc) {
        gc.oval(x, y, width, height);
	}
}
