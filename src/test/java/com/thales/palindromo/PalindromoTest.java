package com.thales.palindromo;

import org.junit.Test;

import java.util.ArrayList;

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
        boolean statusResultado = true;

        ArrayList<Boolean> listaDeFrases = new ArrayList<>();
        listaDeFrases.add(palindromo.isPalindromo("Rotator"));
        listaDeFrases.add(palindromo.isPalindromo("bob"));
        listaDeFrases.add(palindromo.isPalindromo("madam"));
        listaDeFrases.add(palindromo.isPalindromo("mAlAyAlam"));
        listaDeFrases.add(palindromo.isPalindromo("1"));
        listaDeFrases.add(palindromo.isPalindromo("Able was I, ere I saw Elba"));
        listaDeFrases.add(palindromo.isPalindromo("Madam I'm Adam"));
        listaDeFrases.add(palindromo.isPalindromo("Step on no pets"));
        listaDeFrases.add(palindromo.isPalindromo("Top Spot!"));
        listaDeFrases.add(palindromo.isPalindromo("02/02/2020"));
        listaDeFrases.add(palindromo.isPalindromo("Socorram-me subi no onibus em marrocos"));
        

        for(int i=0; i < listaDeFrases.size(); i++){
            if(listaDeFrases.get(i) == false){
                statusResultado = false;
            }
        }

        Assert.assertTrue(statusResultado);
    }

    @Test
    public void deveIdentificarSeNaoEhPalindromo() {
        Palindromo palindromo = new Palindromo();

        boolean resultado = palindromo.isPalindromo("E preciso amar as pessoas como se nao houvesse amanha");
        Assert.assertFalse(resultado);
    }
}
