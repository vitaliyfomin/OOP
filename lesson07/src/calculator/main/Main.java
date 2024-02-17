package calculator.main;

import calculator.ComplexCalculator;
import calculator.entities.MathComplex;
import calculator.strategies.AdditionStrategy;
import calculator.logger.LoggingCalculatorDecorator;

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator(new AdditionStrategy());
        calculator = new LoggingCalculatorDecorator(calculator);

        MathComplex operand1 = new MathComplex(2, 3);
        MathComplex operand2 = new MathComplex(4, 5);

        MathComplex result = calculator.calculate(operand1, operand2);
    }
}
