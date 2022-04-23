package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = number - 1; i >= 2; i--) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}