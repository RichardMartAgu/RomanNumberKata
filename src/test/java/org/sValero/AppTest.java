package org.sValero;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Prueba unitaria para la aplicación.
 */
public class AppTest extends TestCase {

    /**
     * Crea la prueba unitaria.
     *
     * @param testName nombre de la prueba unitaria
     */
    public AppTest(final String testName) {
        super(testName);
    }

    /**
     * @return el conjunto de pruebas que se están probando.
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Prueba rigurosa :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}