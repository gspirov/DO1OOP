package inheritance;

abstract public class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    abstract public void draw(GraphicsContextWrapper gc);
}