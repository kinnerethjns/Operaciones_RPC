package server;

import java.util.Arrays;

public class methods {
    public String suma(String firstNumber, String secondNumber) {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        double suma = num1 + num2;
        return "El resultado de la suma es: "+ suma;
    }
    public String resta(String firstNumber, String secondNumber) {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        double resta = num1 - num2;
        return "El resultado de la resta es: "+ resta;
    }
    public String multiplicacion(String firstNumber, String secondNumber) {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        double multiplicacion = num1 * num2;
        return "El resultado de la multiplicación es: "+ multiplicacion;
    }
    public String division(String firstNumber, String secondNumber) {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        double division = num1 / num2;
        return "El resultado de la división es: "+ division;
    }
    public String exponente(String firstNumber, String secondNumber) {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        double exponente = Math.pow(num1,num2);
        return firstNumber+" elevado al " + secondNumber + " es: "+ exponente;
    }
    public String raiz(String firstNumber) {
        double num1 = Double.parseDouble(firstNumber);
        double raiz = Math.sqrt(num1);
        return "la raíz de "+ firstNumber+ " es: "+ raiz;
    }

}
