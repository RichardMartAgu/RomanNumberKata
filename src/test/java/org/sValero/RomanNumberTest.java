package org.sValero;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {
    @Test
    public void convertTest() {


        Assert.assertEquals("I", RomanNumberConvert.convert(1));
        Assert.assertEquals("II", RomanNumberConvert.convert(2));
        Assert.assertEquals("III", RomanNumberConvert.convert(3));
        Assert.assertEquals("IV", RomanNumberConvert.convert(4));
        Assert.assertEquals("V", RomanNumberConvert.convert(5));
        Assert.assertEquals("VI", RomanNumberConvert.convert(6));
        Assert.assertEquals("VII", RomanNumberConvert.convert(7));
        Assert.assertEquals("VIII", RomanNumberConvert.convert(8));
        Assert.assertEquals("IX", RomanNumberConvert.convert(9));
        Assert.assertEquals("XIV", RomanNumberConvert.convert(14));
        Assert.assertEquals("XVI", RomanNumberConvert.convert(16));
        Assert.assertEquals("XXII", RomanNumberConvert.convert(22));
        Assert.assertEquals("XXXIV", RomanNumberConvert.convert(34));
        Assert.assertEquals("XLIII", RomanNumberConvert.convert(43));
        Assert.assertEquals("LVII", RomanNumberConvert.convert(57));
        Assert.assertEquals("LXVIII", RomanNumberConvert.convert(68));
        Assert.assertEquals("LXXXIX", RomanNumberConvert.convert(89));
        Assert.assertEquals("C", RomanNumberConvert.convert(100));

    }
}
