package point2dandcomplex;

public class Complex {
    private double real;
    private double imag;

    // Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters
    public double getReal() { return real; }
    public double getImag() { return imag; }

    // Magnitude
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Addition
    public Complex add(Complex other) {
        return new Complex(real + other.real, imag + other.imag);
    }

    // Subtraction
    public Complex subtract(Complex other) {
        return new Complex(real - other.real, imag - other.imag);
    }

    // Multiplication
    public Complex multiply(Complex other) {
        double r = real * other.real - imag * other.imag;
        double i = real * other.imag + imag * other.real;
        return new Complex(r, i);
    }

    // ToString for displaying
    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}
