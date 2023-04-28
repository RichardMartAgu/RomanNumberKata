package org.sValero;

    /**Clase que permite la conversión de números enteros
     * en su representación numérica romana.
    **/
public final class RomanNumberConvert {

    /**
     * Representación de las unidades en números romanos.
     */
    private static final String[] UNITS = {"", "I", "II", "III", "IV",
            "V", "VI", "VII", "VIII", "IX"};

    /**
     * Representación de las decenas en números romanos.
     */

    private static final String[] TENS = {"", "X", "XX", "XXX", "XL",
            "L", "LX", "LXX", "LXXX", "XC"};

    /**
     * Representación de las centenas en números romanos.
     */

    private static final String[] HUNDREDS = {"", "C", "CC", "CCC", "CD",
            "D", "DC", "DCC", "DCCC", "CM"};

    /**
     * Representación de los millares en números romanos.
     */

    private static final String[] THOUSANDS ={"", "M", "MM", "MMM"};

    //Constructor privado para evitar la creación de instancias de la clase.

    private RomanNumberConvert(){}

    //Convierte un número entero en su representación numérica romana.

    public static String convert(final int number){
        int diez = 10;
        int cien = 100;
        int mil = 1000;
        int uno = 1 ;
        int tresmil = 3000;

        if (number < uno || number > tresmil){
            throw new IllegalArgumentException("El número debe estar entre 1 y 3000");
        }

        final int unit = number % diez;
        final int ten = (number / diez) % diez;
        final int hundred = (number / cien) % diez;
        final int thousand = number / mil;

        return THOUSANDS[thousand] + HUNDREDS[hundred] + TENS[ten] + UNITS[unit];
    }
}