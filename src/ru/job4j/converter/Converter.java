package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int ruble = 420;
        int euro = Converter.rubleToEuro(ruble);
        int dollar = rubleToDollar(ruble);
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passedEuro = expected == out;
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        boolean passedDollar = expected == out;
        System.out.println(ruble + " rubles are " + euro + " euro. Test result :" + passedEuro);
        System.out.println(ruble + " rubles are " + dollar + " dollar. Test result :" + passedDollar);
    }
}
