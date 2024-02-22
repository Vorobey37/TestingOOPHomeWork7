package org.example;

public class Calculator implements iCalculate{

    private iComplexNumber firstNumber;


    public Calculator(iComplexNumber firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Override
    public iCalculate sum (iComplexNumber arg) {

        double resultRealPart = firstNumber.getRealPart() + arg.getRealPart();
        double resultImagePart = firstNumber.getImagePart() + arg.getImagePart();

        firstNumber.setRealPart(resultRealPart);
        firstNumber.setImagePart(resultImagePart);

        return this;
    }

    @Override
    public iCalculate multi(iComplexNumber arg) {

        //с целью упростить конструкцию умножения
        double a = firstNumber.getRealPart();
        double b = firstNumber.getImagePart();
        double c = arg.getRealPart();
        double d = arg.getImagePart();

        firstNumber.setRealPart(a*c - b*d);
        firstNumber.setImagePart(b*c + a*d);

        return this;
    }

    @Override
    public iCalculate subt(iComplexNumber arg) {

        double resultRealPart = firstNumber.getRealPart() - arg.getRealPart();
        double resultImagePart = firstNumber.getImagePart() - arg.getImagePart();

        firstNumber.setRealPart(resultRealPart);
        firstNumber.setImagePart(resultImagePart);

        return this;
    }

    @Override
    public iCalculate div(iComplexNumber arg) {

        //с целью упростить конструкцию деления
        double a = firstNumber.getRealPart();
        double b = firstNumber.getImagePart();
        double c = arg.getRealPart();
        double d = arg.getImagePart();

        try {
            firstNumber.setRealPart((a*c + b*d)/(c*c + d*d));
            firstNumber.setImagePart((b*c - a*d)/(c*c + d*d));
        } catch (Exception e) {
            System.out.println(e);
        }

        return this;
    }

    @Override
    public iComplexNumber getResult() {

        return firstNumber;
    }

}
