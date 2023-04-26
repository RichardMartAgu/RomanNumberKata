package org.sValero;

public class RomanNumberConvert {
    public String convert(int integer) {

        String romanNumber = null;

        if (integer == 1) {
            romanNumber = "I";
        }
        if (integer == 2) {
            romanNumber = "II";
        }
        if (integer == 3) {
            romanNumber = "III";
        }
        if (integer == 4) {
            romanNumber = "IV";
        }
        if (integer == 5) {
            romanNumber = "V";
        }
        if (integer == 6) {
            romanNumber = "VI";
        }
        if (integer == 7) {
            romanNumber = "VII";
        }
        if (integer == 8) {
            romanNumber = "VIII";
        }
        if (integer == 9) {
            romanNumber = "IX";
        }if (integer == 10) {
            romanNumber = "X";
        }return romanNumber;
    }
}
