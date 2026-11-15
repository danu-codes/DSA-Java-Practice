package point2dandcomplex;

public class Point2DAndComplexDemo {
    public static void main(String[] args) {
        // --- Point2D Example ---
        Point2D p1 = new Point2D(3, 4);
        Point2D pivot = new Point2D(1, 1);
        Point2D offset = new Point2D(2, -1);

        System.out.println("Original Point: " + p1);
        p1.rotate(pivot, Math.toRadians(90)); // Rotate 90 degrees around pivot
        System.out.println("After Rotation: " + p1);
        p1.translate(offset); // Translate by offset
        System.out.println("After Translation: " + p1);

        // --- Complex Example ---
        Complex c1 = new Complex(4, 3);
        Complex c2 = new Complex(2, -1);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex product = c1.multiply(c2);
        double mag = c1.magnitude();

        System.out.println("\nComplex c1: " + c1);
        System.out.println("Complex c2: " + c2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Magnitude of c1: " + mag);
    }
}
