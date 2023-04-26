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
        return romanNumber;
    }
}
