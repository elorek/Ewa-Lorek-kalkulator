package com.kodilla;

public class Calculator {
    public void Addition() {
        int numberOne = 2;
        int numberTwo = 50;
        int result = numberOne + numberTwo;
        System.out.println(result);
    }
    public void Subtraction() {
        int numberThree = 67;
        int numberFour = 22;
        int result2 = numberThree - numberFour;
        System.out.println(result2);
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.Addition();
    }
}
