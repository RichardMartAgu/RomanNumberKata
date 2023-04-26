package org.sValero;

public class RomanNumberConvert {
    public String convert(int numeroEntero) {

        String romanNumber = null;

        if (numeroEntero == 1) {
            romanNumber = "I";
        }
        if (numeroEntero == 2) {
            romanNumber = "II";
        }
        if (numeroEntero == 3) {
            romanNumber = "III";
        }
        if (numeroEntero == 4) {
            romanNumber = "IV";
        }
        if (numeroEntero == 5) {
            romanNumber = "V";
        }return romanNumber;
    }
}
