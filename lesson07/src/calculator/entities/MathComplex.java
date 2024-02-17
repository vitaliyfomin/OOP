package calculator.entities;

public class MathComplex {
    private double real;
    private double imag;

    public MathComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}
