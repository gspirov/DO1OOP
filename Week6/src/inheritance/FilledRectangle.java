package inheritance;

public class FilledRectangle extends ShapeWithDimensions {
    public FilledRectangle(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(GraphicsContextWrapper gc) {
        gc.fillRect(x, y, width, height);
    }
}
