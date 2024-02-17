package calculator.strategies;

import calculator.entities.MathComplex;

public class AdditionStrategy implements ComplexOperationStrategy {
    @Override
    public MathComplex execute(MathComplex operand1, MathComplex operand2) {
        return new MathComplex(operand1.getReal() + operand2.getReal(), operand1.getImag() + operand2.getImag());
    }
}
