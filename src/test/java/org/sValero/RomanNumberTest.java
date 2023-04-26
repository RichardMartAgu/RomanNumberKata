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
    }
}
