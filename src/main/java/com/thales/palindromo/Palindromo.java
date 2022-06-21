package com.thales.palindromo;

public class Palindromo 
{
    public static void main( String[] args )
    {

    }

    public boolean isPalindromo(String texto) {

        String textoFiltrado = texto.toUpperCase().replace(" ", "")
                                                  .replace("-", "")
                                                  .replace("'", "")
                                                  .replace(",", "")
                                                  .replace("-", "")
                                                  .replace("!", "")
                                                  .replace("/", "")
                                                  .replace("ô", "o");

        for(int i = 0; i < textoFiltrado.length(); i++) {
            int outroLado = textoFiltrado.length() -i - 1;
            if(textoFiltrado.charAt(i) != textoFiltrado.charAt(outroLado)) {
                return false;
            }
        }

        return true;
    }
}
