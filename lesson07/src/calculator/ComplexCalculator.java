package calculator;

import calculator.entities.MathComplex;
import calculator.strategies.ComplexOperationStrategy;

public class ComplexCalculator {
    private final ComplexOperationStrategy strategy;

    public ComplexCalculator(ComplexOperationStrategy strategy) {
        this.strategy = strategy;
    }

    public MathComplex calculate(MathComplex operand1, MathComplex operand2) {
        return strategy.execute(operand1, operand2);
    }
}
