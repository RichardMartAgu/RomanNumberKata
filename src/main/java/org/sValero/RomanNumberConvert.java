package org.sValero;

public class RomanNumberConvert {
    private static final String[] UNIDADES = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] DECENAS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] CENTENAS = {"", "C"};

    public static String convert(int numero) {
        if (numero < 1 || numero > 100) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 100");
        }

        int unidad = numero % 10;
        int decena = (numero / 10) % 10;
        int centena = numero / 100;

        return CENTENAS[centena] + DECENAS[decena] + UNIDADES[unidad];
    }

}
