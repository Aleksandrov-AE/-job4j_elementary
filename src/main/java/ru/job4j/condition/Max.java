package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {

        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int tmp = max(second, third);
        return first >= tmp ? first : tmp;
    }

    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(second, third, fourth);
        return first >= tmp ? first : tmp;
    }

}
