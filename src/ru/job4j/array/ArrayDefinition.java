package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);

        String[] names = new  String[4];

        names[0] = "Tom";
        names[1] = "Mike";
        names[2] = "Nick";
        names[3] = "Sandy";

        for (String name: names) {
            System.out.println(name);
        }
    }
}
