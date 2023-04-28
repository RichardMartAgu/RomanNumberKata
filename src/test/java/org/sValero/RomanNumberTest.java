package org.sValero;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {
    private static final int one = 1;
    private static final int two = 2;
    private static final int three = 3;
    private static final int four = 4;
    private static final int five = 5;
    private static final int six = 6;
    private static final int seven = 7;
    private static final int eight = 8;
    private static final int nine = 9;
    private static final int fourteen = 14;
    private static final int sixteen = 16;
    private static final int twentyTwo = 22;
    private static final int thirtyFour = 34;
    private static final int fortyThree = 43;
    private static final int fiftySeven = 57;
    private static final int sixtyEight = 68;
    private static final int eightyNine = 89;
    private static final int oneHundred = 100;
    private static final int oneHundredTen = 110;
    private static final int twoHundred = 200;
    private static final int fiveHundred = 500;
    private static final int fiveHundredEighteen = 518;
    private static final int sevenHundredTwentyEight = 728;
    private static final int nineHundredNinetyEight = 998;
    private static final int oneThousand = 1000;
    private static final int oneThousandTwentyFour = 1024;
    private static final int oneThousandOneHundredSeventyTwo = 1172;
    private static final int oneThousandFourHundredFiftyNine = 1459;
    private static final int oneThousandFiveHundred = 1500;
    private static final int oneThousandEightHundredSixtyEight = 1868;
    private static final int oneThousandEightHundredSeventyFive = 1875;
    private static final int oneThousandNineHundredNinetyNine = 1999;
    private static final int twoThousand = 2000;
    private static final int twoThousandOneHundredFive = 2105;
    private static final int twoThousandTwoHundredThirtySeven = 2237;
    private static final int twoThousandFourHundredSixtyEight = 2468;
    private static final int twoThousandFiveHundredNinety = 2590;
    private static final int twoThousandSevenHundredEleven = 2711;
    private static final int twoThousandEightHundredThirtyThree = 2833;
    private static final int twoThousandNineHundredSeventyFive = 2975;
    private static final int twoThousandNineHundredNinetyNine = 2999;
    private static final int threeThousand = 3000;
    @Test
    public void convertTest() {

        Assert.assertEquals("I", RomanNumberConvert.convert(one));
        Assert.assertEquals("II", RomanNumberConvert.convert(two));
        Assert.assertEquals("III", RomanNumberConvert.convert(three));
        Assert.assertEquals("IV", RomanNumberConvert.convert(four));
        Assert.assertEquals("V", RomanNumberConvert.convert(five));
        Assert.assertEquals("VI", RomanNumberConvert.convert(six));
        Assert.assertEquals("VII", RomanNumberConvert.convert(seven));
        Assert.assertEquals("VIII", RomanNumberConvert.convert(eight));
        Assert.assertEquals("IX", RomanNumberConvert.convert(nine));
        Assert.assertEquals("XIV", RomanNumberConvert.convert(fourteen));
        Assert.assertEquals("XVI", RomanNumberConvert.convert(sixteen));
        Assert.assertEquals("XXII", RomanNumberConvert.convert(twentyTwo));
        Assert.assertEquals("XXXIV", RomanNumberConvert.convert(thirtyFour));
        Assert.assertEquals("XLIII", RomanNumberConvert.convert(fortyThree));
        Assert.assertEquals("LVII", RomanNumberConvert.convert(fiftySeven));
        Assert.assertEquals("LXVIII", RomanNumberConvert.convert(sixtyEight));
        Assert.assertEquals("LXXXIX", RomanNumberConvert.convert(eightyNine));
        Assert.assertEquals("C", RomanNumberConvert.convert(oneHundred));
        Assert.assertEquals("CX", RomanNumberConvert.convert(oneHundredTen));
        Assert.assertEquals("CC", RomanNumberConvert.convert(twoHundred));
        Assert.assertEquals("D", RomanNumberConvert.convert(fiveHundred));
        Assert.assertEquals("DXVIII", RomanNumberConvert.convert(fiveHundredEighteen));
        Assert.assertEquals("DCCXXVIII", RomanNumberConvert.convert(sevenHundredTwentyEight));
        Assert.assertEquals("CMXCVIII", RomanNumberConvert.convert(nineHundredNinetyEight));
        Assert.assertEquals("M", RomanNumberConvert.convert(oneThousand));
        Assert.assertEquals("MXXIV", RomanNumberConvert.convert(oneThousandTwentyFour));
        Assert.assertEquals("MCLXXII", RomanNumberConvert.convert(oneThousandOneHundredSeventyTwo));
        Assert.assertEquals("MCDLIX", RomanNumberConvert.convert(oneThousandFourHundredFiftyNine));
        Assert.assertEquals("MD", RomanNumberConvert.convert(oneThousandFiveHundred));
        Assert.assertEquals("MDCCCLXVIII", RomanNumberConvert.convert(oneThousandEightHundredSixtyEight));
        Assert.assertEquals("MDCCCLXXV", RomanNumberConvert.convert(oneThousandEightHundredSeventyFive));
        Assert.assertEquals("MCMXCIX", RomanNumberConvert.convert(oneThousandNineHundredNinetyNine));
        Assert.assertEquals("MM", RomanNumberConvert.convert(twoThousand));
        Assert.assertEquals("MMCV", RomanNumberConvert.convert(twoThousandOneHundredFive));
        Assert.assertEquals("MMCCXXXVII", RomanNumberConvert.convert(twoThousandTwoHundredThirtySeven));
        Assert.assertEquals("MMCDLXVIII", RomanNumberConvert.convert(twoThousandFourHundredSixtyEight));
        Assert.assertEquals("MMDXC", RomanNumberConvert.convert(twoThousandFiveHundredNinety));
        Assert.assertEquals("MMDCCXI", RomanNumberConvert.convert(twoThousandSevenHundredEleven));
        Assert.assertEquals("MMDCCCXXXIII", RomanNumberConvert.convert(twoThousandEightHundredThirtyThree));
        Assert.assertEquals("MMCMLXXV", RomanNumberConvert.convert(twoThousandNineHundredSeventyFive));
        Assert.assertEquals("MMCMXCIX", RomanNumberConvert.convert(twoThousandNineHundredNinetyNine));
        Assert.assertEquals("MMM", RomanNumberConvert.convert(threeThousand));

    }
}
