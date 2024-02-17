package calculator.entities;

public class MathComplex {
    private final double real;
    private final double imag;

    public MathComplex() {
        this.real = 0;
        this.imag = 0;
    }

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

    public MathComplex add(MathComplex other) {
        return new MathComplex(this.real + other.real, this.imag + other.imag);
    }

}