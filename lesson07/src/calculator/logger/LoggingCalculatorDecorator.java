package calculator.logger;

import calculator.ComplexCalculator;
import calculator.entities.MathComplex;
import calculator.strategies.ComplexOperationStrategy;

public class LoggingCalculatorDecorator extends ComplexCalculator {
    private final ComplexOperationStrategy strategy;

    public LoggingCalculatorDecorator(ComplexOperationStrategy strategy) {
        super(strategy);
        this.strategy = strategy;
    }

    @Override
    public MathComplex calculate(MathComplex operand1, MathComplex operand2) {
        String operation = operand1 + " + " + operand2;
        CalculatorLogger.log("Calculating: " + operation);
        MathComplex result = super.calculate(operand1, operand2);
        CalculatorLogger.log("Result: " + result);
        return result;
    }
}
