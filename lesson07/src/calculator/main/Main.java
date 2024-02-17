package calculator.main;

import calculator.ComplexCalculator;
import calculator.entities.MathComplex;
import calculator.logger.LoggingCalculatorDecorator;
import calculator.strategies.AdditionStrategy;

public class Main {
    public static void main(String[] args) {
        // Создаем калькулятор с выбранной стратегией (например, сложение)
        ComplexCalculator calculator = new ComplexCalculator(new AdditionStrategy());

        // Оборачиваем калькулятор в декоратор с логированием
        LoggingCalculatorDecorator decoratedCalculator = new LoggingCalculatorDecorator(calculator.getStrategy());

        // Задаем комплексные числа для вычислений
        MathComplex operand1 = new MathComplex(2, 3);
        MathComplex operand2 = new MathComplex(4, 5);

        // Выполняем операцию и получаем результат
        MathComplex result = decoratedCalculator.calculate(operand1, operand2);

        // Выводим результат на консоль
        System.out.println("Result: " + result);
    }
}
