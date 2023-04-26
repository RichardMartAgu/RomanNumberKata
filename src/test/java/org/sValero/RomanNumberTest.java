package org.sValero;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {
    @Test
    public void convertTest() {

        RomanNumberConvert convertidorNumeros = new RomanNumberConvert();
        Assert.assertEquals("I", convertidorNumeros.convert(1));
    }
}
