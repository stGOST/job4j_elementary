package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int ruble = 500;
        int euro = Converter.rubleToEuro(ruble);
        int dollar = rubleToDollar(ruble);
        System.out.println(ruble + " rubles are " + euro + " euro.");
        System.out.println(ruble + " rubles are " + dollar + " dollar.");
    }
}
