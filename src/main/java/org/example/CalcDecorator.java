package org.example;

public class CalcDecorator implements iCalculate {

    private iCalculate calculator;
    private iLogger logger;

    public CalcDecorator(iCalculate calculator, iLogger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public iCalculate sum (iComplexNumber arg) {
        iComplexNumber firstArg = calculator.getResult();
        logger.log("Начинается суммирование чисел: " + firstArg + " и " + arg);
        iCalculate result = calculator.sum(arg);
        logger.log("Суммирование чисел закончено");
        return result;

    }

    @Override
    public iCalculate multi(iComplexNumber arg) {
        iComplexNumber firstArg = calculator.getResult();
        logger.log("Начинается умножение чисел: " + firstArg + " и " + arg);
        iCalculate result = calculator.multi(arg);
        logger.log("Умножение чисел закончено");
        return result;
    }

    @Override
    public iCalculate subt(iComplexNumber arg) {
        iComplexNumber firstArg = calculator.getResult();
        logger.log("Начинается вычитание числа: " + arg + " из " + firstArg);
        iCalculate result = calculator.subt(arg);
        logger.log("Вычитание числа закончено");
        return result;
    }

    @Override
    public iCalculate div(iComplexNumber arg) {
        iComplexNumber firstArg = calculator.getResult();
        logger.log("Начинается деление числа: " + firstArg + " на " + arg);
        iCalculate result = calculator.subt(arg);
        logger.log("Деление числа закончено");
        return result;
    }

    @Override
    public iComplexNumber getResult() {
        iComplexNumber result = calculator.getResult();
        logger.log("Получение результата...");
        return result;

    }

}
