package com.kodilla.testing;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("Result adding: ");
        System.out.println(calculator.addAToB(7, 5));
        System.out.print("Result substract: ");
        System.out.println(calculator.substractAFromB(15,5));
    }
}
