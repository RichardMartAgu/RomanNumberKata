package org.sValero;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {
    private static final int One = 1;
    private static final int Two = 2;
    private static final int Three = 3;
    private static final int Four = 4;
    private static final int Five = 5;
    private static final int Six = 6;
    private static final int Seven = 7;
    private static final int Eight = 8;
    private static final int Nine = 9;
    private static final int Fourteen = 14;
    private static final int Sixteen = 16;
    private static final int TwentyTwo = 22;
    private static final int ThirtyFour = 34;
    private static final int FortyThree = 43;
    private static final int FiftySeven = 57;
    private static final int SixtyEight = 68;
    private static final int EightyNine = 89;
    private static final int OneHundred = 100;
    private static final int OneHundredTen = 110;
    private static final int TwoHundred = 200;
    private static final int FiveHundred = 500;
    private static final int FiveHundredEighteen = 518;
    private static final int SevenHundredTwentyEight = 728;
    private static final int NineHundredNinetyEight = 998;
    private static final int OneThousand = 1000;
    private static final int OneThousandTwentyFour = 1024;
    private static final int OneThousandOneHundredSeventyTwo = 1172;
    private static final int OneThousandFourHundredFiftyNine = 1459;
    private static final int OneThousandFiveHundred = 1500;
    private static final int OneThousandEightHundredSixtyEight = 1868;
    private static final int OneThousandEightHundredSeventyFive = 1875;
    private static final int OneThousandNineHundredNinetyNine = 1999;
    private static final int TwoThousand = 2000;
    private static final int TwoThousandOneHundredFive = 2105;
    private static final int TwoThousandTwoHundredThirtySeven = 2237;
    private static final int TwoThousandFourHundredSixtyEight = 2468;
    private static final int TwoThousandFiveHundredNinety = 2590;
    private static final int TwoThousandSevenHundredEleven = 2711;
    private static final int TwoThousandEightHundredThirtyThree = 2833;
    private static final int TwoThousandNineHundredSeventyFive = 2975;
    private static final int TwoThousandNineHundredNinetyNine = 2999;
    private static final int ThreeThousand = 3000;

    @Test
    public void convertTest() {

        Assert.assertEquals("I", RomanNumberConvert.convert(One));
        Assert.assertEquals("II", RomanNumberConvert.convert(Two));
        Assert.assertEquals("III", RomanNumberConvert.convert(Three));
        Assert.assertEquals("IV", RomanNumberConvert.convert(Four));
        Assert.assertEquals("V", RomanNumberConvert.convert(Five));
        Assert.assertEquals("VI", RomanNumberConvert.convert(Six));
        Assert.assertEquals("VII", RomanNumberConvert.convert(Seven));
        Assert.assertEquals("VIII", RomanNumberConvert.convert(Eight));
        Assert.assertEquals("IX", RomanNumberConvert.convert(Nine));
        Assert.assertEquals("XIV", RomanNumberConvert.convert(Fourteen));
        Assert.assertEquals("XVI", RomanNumberConvert.convert(Sixteen));
        Assert.assertEquals("XXII", RomanNumberConvert.convert(TwentyTwo));
        Assert.assertEquals("XXXIV", RomanNumberConvert.convert(ThirtyFour));
        Assert.assertEquals("XLIII", RomanNumberConvert.convert(FortyThree));
        Assert.assertEquals("LVII", RomanNumberConvert.convert(FiftySeven));
        Assert.assertEquals("LXVIII", RomanNumberConvert.convert(SixtyEight));
        Assert.assertEquals("LXXXIX", RomanNumberConvert.convert(EightyNine));
        Assert.assertEquals("C", RomanNumberConvert.convert(OneHundred));
        Assert.assertEquals("CX", RomanNumberConvert.convert(OneHundredTen));
        Assert.assertEquals("CC", RomanNumberConvert.convert(TwoHundred));
        Assert.assertEquals("D", RomanNumberConvert.convert(FiveHundred));
        Assert.assertEquals("DXVIII", RomanNumberConvert.convert(FiveHundredEighteen));
        Assert.assertEquals("DCCXXVIII", RomanNumberConvert.convert(SevenHundredTwentyEight));
        Assert.assertEquals("CMXCVIII", RomanNumberConvert.convert(NineHundredNinetyEight));
        Assert.assertEquals("M", RomanNumberConvert.convert(OneThousand));
        Assert.assertEquals("MXXIV", RomanNumberConvert.convert(OneThousandTwentyFour));
        Assert.assertEquals("MCLXXII", RomanNumberConvert.convert(OneThousandOneHundredSeventyTwo));
        Assert.assertEquals("MCDLIX", RomanNumberConvert.convert(OneThousandFourHundredFiftyNine));
        Assert.assertEquals("MD", RomanNumberConvert.convert(OneThousandFiveHundred));
        Assert.assertEquals("MDCCCLXVIII", RomanNumberConvert.convert(OneThousandEightHundredSixtyEight));
        Assert.assertEquals("MDCCCLXXV", RomanNumberConvert.convert(OneThousandEightHundredSeventyFive));
        Assert.assertEquals("MCMXCIX", RomanNumberConvert.convert(OneThousandNineHundredNinetyNine));
        Assert.assertEquals("MM", RomanNumberConvert.convert(TwoThousand));
        Assert.assertEquals("MMCV", RomanNumberConvert.convert(TwoThousandOneHundredFive));
        Assert.assertEquals("MMCCXXXVII", RomanNumberConvert.convert(TwoThousandTwoHundredThirtySeven));
        Assert.assertEquals("MMCDLXVIII", RomanNumberConvert.convert(TwoThousandFourHundredSixtyEight));
        Assert.assertEquals("MMDXC", RomanNumberConvert.convert(TwoThousandFiveHundredNinety));
        Assert.assertEquals("MMDCCXI", RomanNumberConvert.convert(TwoThousandSevenHundredEleven));
        Assert.assertEquals("MMDCCCXXXIII", RomanNumberConvert.convert(TwoThousandEightHundredThirtyThree));
        Assert.assertEquals("MMCMLXXV", RomanNumberConvert.convert(TwoThousandNineHundredSeventyFive));
        Assert.assertEquals("MMCMXCIX", RomanNumberConvert.convert(TwoThousandNineHundredNinetyNine));
        Assert.assertEquals("MMM", RomanNumberConvert.convert(ThreeThousand));

    }
}
