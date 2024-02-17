package calculator.logger;

import calculator.ComplexCalculator;
import calculator.entities.MathComplex;

public class LoggingCalculatorDecorator extends ComplexCalculator {
    private final ComplexCalculator calculator;

    public LoggingCalculatorDecorator(ComplexCalculator calculator) {
        super(calculator.getStrategy()); // Теперь используем метод getStrategy()
        this.calculator = calculator;
    }

    @Override
    public MathComplex calculate(MathComplex operand1, MathComplex operand2) {
        String operation = operand1 + " + " + operand2;
        CalculatorLogger.log("Calculating: " + operation);
        MathComplex result = calculator.calculate(operand1, operand2);
        CalculatorLogger.log("Result: " + result);
        return result;
    }
}