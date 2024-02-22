package org.example;

import java.util.Scanner;

public class View {

    private iCalculate calc;
    private final Scanner SCANNER = new Scanner(System.in);

    public View(iCalculate calc) {
        this.calc = calc;
    }

    /**Создание комплексного числа
     * @return комплексное число
     */
    public iComplexNumber createNumber(){

        double realPart = promptDouble("Введите значение вещественной части комплексного числа: ");
        double imagePart = promptDouble("Введите значение мнимой части комплексного числа: ");
        iComplexNumber result = new ComplexNumber(realPart, imagePart);
        return result;

    }



    public void run() {

        while (true) {
            System.out.println("Введите первый аргумент: ");
            iComplexNumber primaryArg = createNumber();
            System.out.println("Производится запись первого аргумента... ");
            calc.sum(primaryArg);

            while (true) {

                String cmd = prompt("Введите команду (+, -, *, /, =) : ");

                if (cmd.equals("*")) {
                    System.out.println("Введите второй аргумент: ");
                    iComplexNumber arg = createNumber();
                    calc.multi(arg);
                    continue;
                }

                if (cmd.equals("+")) {
                    System.out.println("Введите второй аргумент: ");
                    iComplexNumber arg = createNumber();
                    calc.sum(arg);
                    continue;
                }

                if (cmd.equals("-")) {
                    System.out.println("Введите второй аргумент: ");
                    iComplexNumber arg = createNumber();
                    calc.subt(arg);
                    continue;
                }

                if (cmd.equals("/")) {
                    System.out.println("Введите второй аргумент: ");
                    iComplexNumber arg = createNumber();
                    if (arg.getRealPart() == 0 && arg.getImagePart() == 0) {

                        while (arg.getRealPart() == 0 && arg.getImagePart() == 0){
                            System.out.println("На ноль делить нельзя, попробуйте ещё раз ввести число: ");
                            arg = createNumber();
                        }
                    }
                    calc.div(arg);
                    continue;
                }

                if (cmd.equals("=")) {
                    System.out.println("Результат: " + calc.getResult());
                    break;
                }

            }

            String cmd = prompt("Еще раз посчитать? (Y/N)");

            if (cmd.equals("Y")) {
                System.out.println("Производится обнуление калькулятора... ");
                calc.multi(new ComplexNumber(0, 0)); //для обнуления значения (кнопка "C" на калькуляторе)
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {

        System.out.print(message);
        return SCANNER.nextLine();
    }

    private double promptDouble(String message) {

        System.out.print(message);
        return Double.parseDouble(SCANNER.nextLine());
    }
}
