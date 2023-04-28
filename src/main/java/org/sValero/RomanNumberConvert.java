package org.sValero;

/** Clase que convierte números romanos. */
public final class RomanNumberConvert {

  /** Número fijo para cálculos. */
  private static final int UNITS_IN_TEN = 10;
  /** Número fijo para cálculos. */
  private static final int UNITS_IN_HUNDRED = 100;
  /** Número fijo para cálculos. */
  private static final int UNITS_IN_THOUSAND = 1000;

  /** Representación de las unidades en números romanos. */
  private static final String[] UNITS = {
    "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
  };

  /** Representación de las decenas en números romanos. */
  private static final String[] TENS = {
    "",
    // esta es la única forma de que no pete
    "X",
    "XX",
    "XXX",
    "XL",
    "L",
    "LX",
    "LXX",
    "LXXX",
    "XC"
  };

  /** Representación de las centenas en números romanos. */
  private static final String[] HUNDREDS = {
    "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"
  };

  /** Representación de los millares en números romanos. */
  private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};

  // Constructor privado para evitar la creación de instancias de la clase.

  private RomanNumberConvert() {
    // para que no pete lo bajo
  }

  // Convierte un número entero en su representación numérica romana.
  /**
   * Convierte los números romanos en enteros.
   *
   * @param number El número entero a convertir.
   * @return El número romano correspondiente.
   */
  public static String convert(final int number) {

    final int unit = number % UNITS_IN_TEN;
    final int ten = (number / UNITS_IN_TEN) % UNITS_IN_TEN;
    final int hundred = (number / UNITS_IN_HUNDRED) % UNITS_IN_TEN;
    final int thousand = number / UNITS_IN_THOUSAND;

    return THOUSANDS[thousand] + HUNDREDS[hundred] + TENS[ten] + UNITS[unit];
  }
}
