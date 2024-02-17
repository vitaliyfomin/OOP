package calculator.logger;

import calculator.entities.MathComplex;
import calculator.strategies.ComplexOperationStrategy;

public class LoggingCalculatorDecorator implements ComplexOperationStrategy {
    private final ComplexOperationStrategy strategy;

    public LoggingCalculatorDecorator(ComplexOperationStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public MathComplex execute(MathComplex operand1, MathComplex operand2) {
        String operation = operand1 + " + " + operand2;
        CalculatorLogger.log("Calculating: " + operation);
        MathComplex result = strategy.execute(operand1, operand2);
        CalculatorLogger.log("Result: " + result);
        return result;
    }
}
