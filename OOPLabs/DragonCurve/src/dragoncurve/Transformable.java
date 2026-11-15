package dragoncurve;

public interface Transformable {

    /** Rotates this point around the pivot by the given angle (in radians). */
    void rotate(Point pivot, double angle);

    /** Translates this point by the given offset. */
    void translate(Point offset);
}
