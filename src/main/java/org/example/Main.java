package org.example;

public class Main {
    public static void main(String[] args) {

        iCalculate complexCalculator = new CalcDecorator(new Calculator(new ComplexNumber(0, 0)), new Logger());
        View view = new View(complexCalculator);
        view.run();

    }
}