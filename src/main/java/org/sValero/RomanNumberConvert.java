package org.sValero;

/** Clase que permite la conversión de números enteros en su representación numérica romana. */
public final class RomanNumberConvert {

  /** Número mínimo. */
  private static final int MINIMUM_NUMBER = 1;
  /** Número máximo. */
  private static final int MAXIMUM_NUMBER = 3000;
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
  private static final String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

  /** Representación de las centenas en números romanos. */
  private static final String[] HUNDREDS = {
    "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"
  };

  /** Representación de los millares en números romanos. */
  private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};

  // Constructor privado para evitar la creación de instancias de la clase.

  private RomanNumberConvert() {}

  // Convierte un número entero en su representación numérica romana.
  /**
   * Convierte los números romanos en enteros.
   *
   * @param number El número entero a convertir.
   * @return El número romano correspondiente.
   * @throws IllegalArgumentException si el número está fuera del rango permitido.
   */
  public static String convert(final int number) {

    if (number < MINIMUM_NUMBER || number > MAXIMUM_NUMBER) {
      throw new IllegalArgumentException("El número debe " + "estar entre 1 y 3000");
    }

    final int unit = number % UNITS_IN_TEN;
    final int ten = (number / UNITS_IN_TEN) % UNITS_IN_TEN;
    final int hundred = (number / UNITS_IN_HUNDRED) % UNITS_IN_TEN;
    final int thousand = number / UNITS_IN_THOUSAND;

    return THOUSANDS[thousand] + HUNDREDS[hundred] + TENS[ten] + UNITS[unit];
  }
}
