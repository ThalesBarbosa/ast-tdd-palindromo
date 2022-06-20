package com.thales.palindromo;

import org.junit.Test;
import org.junit.Assert;

public class PalindromoTest {
    @Test
    public void validarPalindromoEFiltrarCaracteresInvalidos() {
        Palindromo palindromo = new Palindromo();

        boolean resultado = palindromo.isPalindromo("Socorram-me subi no onibus em Marrocos");
        Assert.assertTrue(resultado);
    }

    @Test
    public void identificarPalindromo() {
        Palindromo palindromo = new Palindromo();

        boolean resultado = palindromo.isPalindromo("Anotaram a data da maratona");
        Assert.assertTrue(resultado);
    }

    @Test
    public void deveIdentificarSeNaoEhPalindromo() {
        Palindromo palindromo = new Palindromo();

        boolean resultado = palindromo.isPalindromo("E preciso amar as pessoas como se nao houvesse amanha");
        Assert.assertFalse(resultado);
    }
}
