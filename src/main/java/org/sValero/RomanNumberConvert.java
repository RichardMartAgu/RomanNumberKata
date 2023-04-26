package org.sValero;

public class RomanNumberConvert {
    private static final String[] UNIDADES = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] DECENAS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] CENTENAS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] MILES = {"", "M", "MM", "MMM"};

    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 1000");
        }

        int unidad = number % 10;
        int decena = (number / 10) % 10;
        int centena = (number / 100) % 10;
        int mil = number / 1000;

        return MILES[mil] + CENTENAS[centena] + DECENAS[decena] + UNIDADES[unidad];
    }

}
