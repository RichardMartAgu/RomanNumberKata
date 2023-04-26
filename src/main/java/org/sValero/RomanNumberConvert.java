package org.sValero;

public class RomanNumberConvert {
    private static final String[] UNITS = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};

    public static String convert(int number) {
        if (number < 1 || number > 3000) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 1000");
        }

        int unit  = number % 10;
        int ten  = (number / 10) % 10;
        int hundred  = (number / 100) % 10;
        int thousand  = number / 1000;

        return THOUSANDS[thousand ] + HUNDREDS[hundred ] + TENS[ten ] + UNITS[unit ];
    }

}
