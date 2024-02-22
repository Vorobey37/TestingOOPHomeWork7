package org.example;

public interface iCalculate {

    iCalculate sum(iComplexNumber arg);
    iCalculate multi(iComplexNumber arg);
    iCalculate subt(iComplexNumber arg);
    iCalculate div(iComplexNumber arg);
    iComplexNumber getResult();
}
