package org.example;

public class ComplexNumber implements iComplexNumber {

    private double realPart;
    private double imagePart;

    public ComplexNumber(double realPart, double imagePart) {
        this.realPart = realPart;
        this.imagePart = imagePart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImagePart() {
        return imagePart;
    }

    @Override
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    @Override
    public void setImagePart(double imagePart) {
        this.imagePart = imagePart;
    }

    @Override
    public String toString(){

        return realPart + " + " + imagePart + "i";
    }
}
