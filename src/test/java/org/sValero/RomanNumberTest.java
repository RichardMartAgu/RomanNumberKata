package org.sValero;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {
    @Test
    public void convertTest() {

        RomanNumberConvert convertidorNumeros = new RomanNumberConvert();
        Assert.assertEquals("I", convertidorNumeros.convert(1));
        Assert.assertEquals("II", convertidorNumeros.convert(2));
        Assert.assertEquals("III", convertidorNumeros.convert(3));
        Assert.assertEquals("IV", convertidorNumeros.convert(4));
        Assert.assertEquals("V", convertidorNumeros.convert(5));
        Assert.assertEquals("VI", convertidorNumeros.convert(6));
        Assert.assertEquals("VII", convertidorNumeros.convert(7));
        Assert.assertEquals("VIII", convertidorNumeros.convert(8));
        Assert.assertEquals("IX", convertidorNumeros.convert(9));
        Assert.assertEquals("X", convertidorNumeros.convert(10));
    }
}
