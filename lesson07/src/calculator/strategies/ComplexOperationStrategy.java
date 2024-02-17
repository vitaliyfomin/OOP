package calculator.strategies;

import calculator.entities.MathComplex;

public interface ComplexOperationStrategy {
    MathComplex execute(MathComplex operand1, MathComplex operand2);
}
