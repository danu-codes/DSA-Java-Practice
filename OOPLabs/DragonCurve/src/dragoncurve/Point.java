package dragoncurve;

public class Point implements Transformable {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /** Rotates this point around the pivot; angle is in radians. */
    @Override
    public void rotate(Point pivot, double angle) {
        double sinAngle = Math.sin(angle);
        double cosAngle = Math.cos(angle);

        double dx = x - pivot.getX();
        double dy = y - pivot.getY();

        double rotatedX = cosAngle * dx - sinAngle * dy + pivot.getX();
        double rotatedY = sinAngle * dx + cosAngle * dy + pivot.getY();

        setX(rotatedX);
        setY(rotatedY);
    }

    @Override
    public void translate(Point offset) {
        setX(this.getX() + offset.getX());
        setY(this.getY() + offset.getY());
    }
}
