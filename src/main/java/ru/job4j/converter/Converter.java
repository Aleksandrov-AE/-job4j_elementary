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
        float in = 140F;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        var rub = 200F;
        float euro = Converter.rubleToEuro(rub);
        System.out.println(rub + "rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(rub);
        System.out.println(rub + "rubles are " + dollar + " dollar.");
    }
}