package org.sValero;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {
  /** Variable para entrada del número 1 en test. */
  private static final int TEST1 = 1;
  /** Variable para entrada del número 2 en test. */
  private static final int TEST2 = 2;
  /** Variable para entrada del número 3 en test. */
  private static final int TEST3 = 3;
  /** Variable para entrada del número 4 en test. */
  private static final int TEST4 = 4;
  /** Variable para entrada del número 5 en test. */
  private static final int TEST5 = 5;
  /** Variable para entrada del número 6 en test. */
  private static final int TEST6 = 6;
  /** Variable para entrada del número 7 en test. */
  private static final int TEST7 = 7;
  /** Variable para entrada del número 8 en test. */
  private static final int TEST8 = 8;
  /** Variable para entrada del número 9 en test. */
  private static final int TEST9 = 9;
  /** Variable para entrada del número 14 en test. */
  private static final int TEST10 = 14;
  /** Variable para entrada del número 16 en test. */
  private static final int TEST11 = 16;
  /** Variable para entrada del número 22 en test. */
  private static final int TEST12 = 22;
  /** Variable para entrada del número 34 en test. */
  private static final int TEST13 = 34;
  /** Variable para entrada del número 43 en test. */
  private static final int TEST14 = 43;
  /** Variable para entrada del número 57 en test. */
  private static final int TEST15 = 57;
  /** Variable para entrada del número 68 en test. */
  private static final int TEST16 = 68;
  /** Variable para entrada del número 89 en test. */
  private static final int TEST17 = 89;
  /** Variable para entrada del número 100 en test. */
  private static final int TEST18 = 100;
  /** Variable para entrada del número 110 en test. */
  private static final int TEST19 = 110;
  /** Variable para entrada del número 200 en test. */
  private static final int TEST20 = 200;
  /** Variable para entrada del número 500 en test. */
  private static final int TEST21 = 500;
  /** Variable para entrada del número 518 en test. */
  private static final int TEST22 = 518;
  /** Variable para entrada del número 728 en test. */
  private static final int TEST23 = 728;
  /** Variable para entrada del número 998 en test. */
  private static final int TEST24 = 998;
  /** Variable para entrada del número 1000 en test. */
  private static final int TEST25 = 1000;
  /** Variable para entrada del número 1024 en test. */
  private static final int TEST26 = 1024;
  /** Variable para entrada del número 1172 en test. */
  private static final int TEST27 = 1172;
  /** Variable para entrada del número 1459 en test. */
  private static final int TEST28 = 1459;
  /** Variable para entrada del número 1500 en test. */
  private static final int TEST29 = 1500;
  /** Variable para entrada del número 1868 en test. */
  private static final int TEST30 = 1868;
  /** Variable para entrada del número 1875 en test. */
  private static final int TEST31 = 1875;
  /** Variable para entrada del número 1999 en test. */
  private static final int TEST32 = 1999;
  /** Variable para entrada del número 2000 en test. */
  private static final int TEST33 = 2000;
  /** Variable para entrada del número 2105 en test. */
  private static final int TEST34 = 2105;
  /** Variable para entrada del número 2237 en test. */
  private static final int TEST35 = 2237;
  /** Variable para entrada del número 2468 en test. */
  private static final int TEST36 = 2468;
  /** Variable para entrada del número 2590 en test. */
  private static final int TEST37 = 2590;
  /** Variable para entrada del número 2711 en test. */
  private static final int TEST38 = 2711;
  /** Variable para entrada del número 2833 en test. */
  private static final int TEST39 = 2833;
  /** Variable para entrada del número 2975 en test. */
  private static final int TEST40 = 2975;
  /** Variable para entrada del número 2999 en test. */
  private static final int TEST41 = 2999;
  /** Variable para entrada del número 3000 en test. */
  private static final int TEST42 = 3000;

  /** Test de tdd. */
  @Test
  public void convertTest() {

    Assert.assertEquals("I", RomanNumberConvert.convert(TEST1));
    Assert.assertEquals("II", RomanNumberConvert.convert(TEST2));
    Assert.assertEquals("III", RomanNumberConvert.convert(TEST3));
    Assert.assertEquals("IV", RomanNumberConvert.convert(TEST4));
    Assert.assertEquals("V", RomanNumberConvert.convert(TEST5));
    Assert.assertEquals("VI", RomanNumberConvert.convert(TEST6));
    Assert.assertEquals("VII", RomanNumberConvert.convert(TEST7));
    Assert.assertEquals("VIII", RomanNumberConvert.convert(TEST8));
    Assert.assertEquals("IX", RomanNumberConvert.convert(TEST9));
    Assert.assertEquals("XIV", RomanNumberConvert.convert(TEST10));
    Assert.assertEquals("XVI", RomanNumberConvert.convert(TEST11));
    Assert.assertEquals("XXII", RomanNumberConvert.convert(TEST12));
    Assert.assertEquals("XXXIV", RomanNumberConvert.convert(TEST13));
    Assert.assertEquals("XLIII", RomanNumberConvert.convert(TEST14));
    Assert.assertEquals("LVII", RomanNumberConvert.convert(TEST15));
    Assert.assertEquals("LXVIII", RomanNumberConvert.convert(TEST16));
    Assert.assertEquals("LXXXIX", RomanNumberConvert.convert(TEST17));
    Assert.assertEquals("C", RomanNumberConvert.convert(TEST18));
    Assert.assertEquals("CX", RomanNumberConvert.convert(TEST19));
    Assert.assertEquals("CC", RomanNumberConvert.convert(TEST20));
    Assert.assertEquals("D", RomanNumberConvert.convert(TEST21));
    Assert.assertEquals("DXVIII", RomanNumberConvert.convert(TEST22));
    Assert.assertEquals("DCCXXVIII", RomanNumberConvert.convert(TEST23));
    Assert.assertEquals("CMXCVIII", RomanNumberConvert.convert(TEST24));
    Assert.assertEquals("M", RomanNumberConvert.convert(TEST25));
    Assert.assertEquals("MXXIV", RomanNumberConvert.convert(TEST26));
    Assert.assertEquals("MCLXXII", RomanNumberConvert.convert(TEST27));
    Assert.assertEquals("MCDLIX",RomanNumberConvert.convert(TEST28));
    Assert.assertEquals("MD",RomanNumberConvert.convert(TEST29));
    Assert.assertEquals("MDCCCLXVIII", RomanNumberConvert.convert(TEST30));
    Assert.assertEquals("MDCCCLXXV", RomanNumberConvert.convert(TEST31));
    Assert.assertEquals("MCMXCIX", RomanNumberConvert.convert(TEST32));
    Assert.assertEquals("MM", RomanNumberConvert.convert(TEST33));
    Assert.assertEquals("MMCV", RomanNumberConvert.convert(TEST34));
    Assert.assertEquals("MMCCXXXVII", RomanNumberConvert.convert(TEST35));
    Assert.assertEquals("MMCDLXVIII", RomanNumberConvert.convert(TEST36));
    Assert.assertEquals("MMDXC", RomanNumberConvert.convert(TEST37));
    Assert.assertEquals("MMDCCXI", RomanNumberConvert.convert(TEST38));
    Assert.assertEquals("MMDCCCXXXIII", RomanNumberConvert.convert(TEST39));
    Assert.assertEquals("MMCMLXXV", RomanNumberConvert.convert(TEST40));
    Assert.assertEquals("MMCMXCIX", RomanNumberConvert.convert(TEST41));
    Assert.assertEquals("MMM", RomanNumberConvert.convert(TEST42));
  }
}
