package org.sValero;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {
    /**
     * Variable para entrada del número 1 en test
     */
    private static final int ONE = 1;
    /**
     * Variable para entrada del número 2 en test
     */
    private static final int TWO = 2;
    /**
     * Variable para entrada del número 3 en test
     */
    private static final int THREE = 3;
    /**
     * Variable para entrada del número 4 en test
     */
    private static final int FOUR = 4;
    /**
     * Variable para entrada del número 5 en test
     */
    private static final int FIVE = 5;
    /**
     * Variable para entrada del número 6 en test
     */
    private static final int SIX = 6;
    /**
     * Variable para entrada del número 7 en test
     */
    private static final int SEVEN = 7;
    /**
     * Variable para entrada del número 8 en test
     */
    private static final int EIGHT = 8;
    /**
     * Variable para entrada del número 9 en test
     */
    private static final int NINE = 9;
    /**
     * Variable para entrada del número 14 en test
     */
    private static final int FOURTEEN = 14;
    /**
     * Variable para entrada del número 16 en test
     */
    private static final int SIXTEEN = 16;
    /**
     * Variable para entrada del número 22 en test
     */
    private static final int TWENTY_TWO = 22;
    /**
     * Variable para entrada del número 34 en test
     */
    private static final int THIRTY_FOUR = 34;
    /**
     * Variable para entrada del número 43 en test
     */
    private static final int FORTY_THREE = 43;
    /**
     * Variable para entrada del número 57 en test
     */
    private static final int FIFTY_SEVEN = 57;
    /**
     * Variable para entrada del número 68 en test
     */
    private static final int SIXTY_EIGHT = 68;
    private static final int EIGHTY_NINE = 89;
    private static final int ONE_HUNDRED = 100;
    private static final int ONE_HUNDRED_TEN = 110;
    private static final int TWO_HUNDRED = 200;
    private static final int FIVE_HUNDRED = 500;
    private static final int FIVE_HUNDRED_EIGHTEEN = 518;
    private static final int SEVEN_HUNDRED_TWENTY_EIGHT = 728;
    private static final int NINE_HUNDRED_NINETY_EIGHT = 998;
    private static final int ONE_THOUSAND = 1000;
    private static final int ONE_THOUSAND_TWENTY_FOUR = 1024;
    private static final int ONE_THOUSAND_ONE_HUNDRED_SEVENTY_TWO = 1172;
    private static final int ONE_THOUSAND_FOUR_HUNDRED_FIFTY_NINE = 1459;
    private static final int ONE_THOUSAND_FIVE_HUNDRED = 1500;
    private static final int ONE_THOUSAND_EIGHT_HUNDRED_SIXTY_EIGHT = 1868;
    private static final int ONE_THOUSAND_EIGHT_HUNDRED_SEVENTY_FIVE = 1875;
    private static final int ONE_THOUSAND_NINE_HUNDRED_NINETY_NINE = 1999;
    private static final int TWO_THOUSAND = 2000;
    private static final int TWO_THOUSAND_ONE_HUNDRED_FIVE = 2105;
    private static final int TWO_THOUSAND_TWO_HUNDRED_THIRTY_SEVEN = 2237;
    private static final int TWO_THOUSAND_FOUR_HUNDRED_SIXTY_EIGHT = 2468;
    private static final int TWO_THOUSAND_FIVE_HUNDRED_NINETY = 2590;
    private static final int TWO_THOUSAND_SEVEN_HUNDRED_ELEVEN = 2711;
    private static final int TWO_THOUSAND_EIGHT_HUNDRED_THIRTY_THREE = 2833;
    private static final int TWO_THOUSAND_NINE_HUNDRED_SEVENTY_FIVE = 2975;
    private static final int TWO_THOUSAND_NINE_HUNDRED_NINETY_NINE = 2999;
    private static final int THREE_THOUSAND = 3000;


    @Test
    public void convertTest() {

        Assert.assertEquals("I", RomanNumberConvert.convert(ONE));
        Assert.assertEquals("II", RomanNumberConvert.convert(TWO));
        Assert.assertEquals("III", RomanNumberConvert.convert(THREE));
        Assert.assertEquals("IV", RomanNumberConvert.convert(FOUR));
        Assert.assertEquals("V", RomanNumberConvert.convert(FIVE));
        Assert.assertEquals("VI", RomanNumberConvert.convert(SIX));
        Assert.assertEquals("VII", RomanNumberConvert.convert(SEVEN));
        Assert.assertEquals("VIII", RomanNumberConvert.convert(EIGHT));
        Assert.assertEquals("IX", RomanNumberConvert.convert(NINE));
        Assert.assertEquals("XIV", RomanNumberConvert.convert(FOURTEEN));
        Assert.assertEquals("XVI", RomanNumberConvert.convert(SIXTEEN));
        Assert.assertEquals("XXII", RomanNumberConvert.convert(TWENTY_TWO));
        Assert.assertEquals("XXXIV", RomanNumberConvert.convert(THIRTY_FOUR));
        Assert.assertEquals("XLIII", RomanNumberConvert.convert(FORTY_THREE));
        Assert.assertEquals("LVII", RomanNumberConvert.convert(FIFTY_SEVEN));
        Assert.assertEquals("LXVIII", RomanNumberConvert.convert(SIXTY_EIGHT));
        Assert.assertEquals("LXXXIX", RomanNumberConvert.convert(EIGHTY_NINE));
        Assert.assertEquals("C", RomanNumberConvert.convert(ONE_HUNDRED));
        Assert.assertEquals("CX", RomanNumberConvert.convert(ONE_HUNDRED_TEN));
        Assert.assertEquals("CC", RomanNumberConvert.convert(TWO_HUNDRED));
        Assert.assertEquals("D",
                RomanNumberConvert.convert(FIVE_HUNDRED));
        Assert.assertEquals("DXVIII",
                RomanNumberConvert.convert(FIVE_HUNDRED_EIGHTEEN));
        Assert.assertEquals("DCCXXVIII",
                RomanNumberConvert.convert(SEVEN_HUNDRED_TWENTY_EIGHT));
        Assert.assertEquals("CMXCVIII",
                RomanNumberConvert.convert(NINE_HUNDRED_NINETY_EIGHT));
        Assert.assertEquals("M",
                RomanNumberConvert.convert(ONE_THOUSAND));
        Assert.assertEquals("MXXIV",
                RomanNumberConvert.convert(ONE_THOUSAND_TWENTY_FOUR));
        Assert.assertEquals("MCLXXII",
                RomanNumberConvert.convert(ONE_THOUSAND_ONE_HUNDRED_SEVENTY_TWO));
        Assert.assertEquals("MCDLIX",
                RomanNumberConvert.convert(ONE_THOUSAND_FOUR_HUNDRED_FIFTY_NINE));
        Assert.assertEquals("MD",
                RomanNumberConvert.convert(ONE_THOUSAND_FIVE_HUNDRED));
        Assert.assertEquals("MDCCCLXVIII",
                RomanNumberConvert.convert(ONE_THOUSAND_EIGHT_HUNDRED_SIXTY_EIGHT));
        Assert.assertEquals("MDCCCLXXV",
                RomanNumberConvert.convert(ONE_THOUSAND_EIGHT_HUNDRED_SEVENTY_FIVE));
        Assert.assertEquals("MCMXCIX",
                RomanNumberConvert.convert(ONE_THOUSAND_NINE_HUNDRED_NINETY_NINE));
        Assert.assertEquals("MM",
                RomanNumberConvert.convert(TWO_THOUSAND));
        Assert.assertEquals("MMCV",
                RomanNumberConvert.convert(TWO_THOUSAND_ONE_HUNDRED_FIVE));
        Assert.assertEquals("MMCCXXXVII",
                RomanNumberConvert.convert(TWO_THOUSAND_TWO_HUNDRED_THIRTY_SEVEN));
        Assert.assertEquals("MMCDLXVIII",
                RomanNumberConvert.convert(TWO_THOUSAND_FOUR_HUNDRED_SIXTY_EIGHT));
        Assert.assertEquals("MMDXC",
                RomanNumberConvert.convert(TWO_THOUSAND_FIVE_HUNDRED_NINETY));
        Assert.assertEquals("MMDCCXI",
                RomanNumberConvert.convert(TWO_THOUSAND_SEVEN_HUNDRED_ELEVEN));
        Assert.assertEquals("MMDCCCXXXIII",
                RomanNumberConvert.convert(TWO_THOUSAND_EIGHT_HUNDRED_THIRTY_THREE));
        Assert.assertEquals("MMCMLXXV",
                RomanNumberConvert.convert(TWO_THOUSAND_NINE_HUNDRED_SEVENTY_FIVE));
        Assert.assertEquals("MMCMXCIX",
                RomanNumberConvert.convert(TWO_THOUSAND_NINE_HUNDRED_NINETY_NINE));
        Assert.assertEquals("MMM",
                RomanNumberConvert.convert(THREE_THOUSAND));

    }
}
