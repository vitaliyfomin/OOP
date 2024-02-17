package calculator.strategies;

import calculator.entities.MathComplex;

public class AdditionStrategy implements ComplexOperationStrategy {
    @Override
    public MathComplex execute(MathComplex operand1, MathComplex operand2) {
        return operand1.add(operand2);
    }
}
