package calculator.strategies;

import calculator.entities.MathComplex;

public class DivisionStrategy implements ComplexOperationStrategy {
    @Override
    public MathComplex execute(MathComplex operand1, MathComplex operand2) {
        double real = (operand1.getReal() * operand2.getReal() + operand1.getImag() * operand2.getImag()) /
                (operand2.getReal() * operand2.getReal() + operand2.getImag() * operand2.getImag());
        double imag = (operand1.getImag() * operand2.getReal() - operand1.getReal() * operand2.getImag()) /
                (operand2.getReal() * operand2.getReal() + operand2.getImag() * operand2.getImag());
        return new MathComplex(real, imag);
    }
}