package calculator.main;

import calculator.ComplexCalculator;
import calculator.entities.MathComplex;
import calculator.logger.CalculatorLogger;
import calculator.strategies.AdditionStrategy;
import calculator.strategies.DivisionStrategy;
import calculator.strategies.MultiplicationStrategy;

public class CalculatorRunner {
    public static void run() {
        // Создаем комплексные числа для операций
        MathComplex operand1 = new MathComplex(2, 3);
        MathComplex operand2 = new MathComplex(4, 5);

        // Создаем калькулятор для сложения
        ComplexCalculator additionCalculator = new ComplexCalculator(new AdditionStrategy());
        MathComplex resultAddition = executeWithLogging(additionCalculator, "Сложение", operand1, operand2);

        // Создаем калькулятор для умножения
        ComplexCalculator multiplicationCalculator = new ComplexCalculator(new MultiplicationStrategy());
        MathComplex resultMultiplication = executeWithLogging(multiplicationCalculator, "Умножение", operand1, operand2);

        // Создаем калькулятор для деления
        ComplexCalculator divisionCalculator = new ComplexCalculator(new DivisionStrategy());
        MathComplex resultDivision = executeWithLogging(divisionCalculator, "Деление", operand1, operand2);

        // Выводим результаты операций
        System.out.println("Результат сложения: " + resultAddition);
        System.out.println("Результат умножения: " + resultMultiplication);
        System.out.println("Результат деления: " + resultDivision);
    }

    private static MathComplex executeWithLogging(ComplexCalculator calculator, String operationName, MathComplex operand1, MathComplex operand2) {
        CalculatorLogger.log("Выполняется операция: " + operationName);
        MathComplex result = calculator.calculate(operand1, operand2);
        CalculatorLogger.log("Операция " + operationName + " завершена. Результат: " + result);
        return result;
    }
}
