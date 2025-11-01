package inheritance;

abstract public class ShapeWithDimensions extends Shape {
    protected double width;
    protected double height;

    public ShapeWithDimensions(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
}