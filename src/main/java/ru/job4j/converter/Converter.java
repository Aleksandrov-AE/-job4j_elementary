package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        var rub = 140F;
        float euro = Converter.rubleToEuro(rub);
        System.out.println(rub + "rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(rub);
        System.out.println(rub + "rubles are " + dollar + " dollar.");
    }
}