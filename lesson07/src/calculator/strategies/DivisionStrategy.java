package calculator.strategies;

import calculator.entities.MathComplex;

public class DivisionStrategy implements ComplexOperationStrategy {
    @Override
    public MathComplex execute(MathComplex operand1, MathComplex operand2) {
        double divisor = operand2.getReal() * operand2.getReal() + operand2.getImag() * operand2.getImag();
        double real = (operand1.getReal() * operand2.getReal() + operand1.getImag() * operand2.getImag()) / divisor;
        double imag = (operand1.getImag() * operand2.getReal() - operand1.getReal() * operand2.getImag()) / divisor;
        return new MathComplex(real, imag);
    }
}
