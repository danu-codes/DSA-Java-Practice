package point2dandcomplex;

public class Point2D implements Transformable {
    private double x;
    private double y;

    // Constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() { return x; }
    public double getY() { return y; }

    // Rotate around a pivot by angle (in radians)
    @Override
    public void rotate(Point2D pivot, double angle) {
        double dx = x - pivot.getX();
        double dy = y - pivot.getY();

        double rotatedX = Math.cos(angle) * dx - Math.sin(angle) * dy + pivot.getX();
        double rotatedY = Math.sin(angle) * dx + Math.cos(angle) * dy + pivot.getY();

        this.x = rotatedX;
        this.y = rotatedY;
    }

    // Translate by an offset point
    @Override
    public void translate(Point2D offset) {
        this.x += offset.getX();
        this.y += offset.getY();
    }

    // ToString for representing the data
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
