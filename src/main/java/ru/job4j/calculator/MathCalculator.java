package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public  static double subAndDiv(double first, double second) {
        return subtract(first, second) + div(first, second);
    }

    public  static double subAndDivAndSumAndMultiply(double first, double second) {
        return subtract(first, second) + div(first, second) + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("calculation result sumAndMultiply(10, 20): " + sumAndMultiply(10, 20));
        System.out.println("calculation result subAndDiv(1, 2): " + subAndDiv(1, 2));
        System.out.println("calculation result subAndDivAndSumAndMultiply(1, 1): " + subAndDivAndSumAndMultiply(1, 1));
    }

}
