package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class ExerciciosTest {

    Exercicios application = new Exercicios();

    @Test
    public void deveRetornar5() {
        Integer expected = 5;
        Integer response = application.soma(2, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar10() {
        Integer expected = 10;
        Integer response = application.soma(5, 5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar4() {
        Integer expected = 4;
        Integer response = application.subtracao(10, 6);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar1() {
        Integer expected = 1;
        Integer response = application.multiplicacao(1, 1);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar2() {
        Integer expected = 2;
        Integer response = application.divisao(2, 1);
        Assert.assertEquals(expected, response);
    }


    @Test
    public void deveRetornarPar() {
        Boolean expected = true;
        Boolean response = application.par(2);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar7() {
        Integer expected = 7;
        Integer response = application.maior(3, 7);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarQuantidadeImpar() {
        Integer expected = 3;
        Integer response = application.quantidadeImpar(6);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarLetrasMaiuscula() {
        String expected = "PATRICIA";
        String response = application.letrasMaiuscula("Patricia");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarLetrasMinuscula() {
        String expected = "patricia";
        String response = application.letrasMinuscula("PATRICIA");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarQuantidadedeLetra7() {
        Integer expected = 7;
        Integer response = application.quantidadeLetra();
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarQuantidadedeLetraEspaco7() {
        Integer expected = 7;
        Integer response = application.quantidadeLetraEspaco();
        Assert.assertEquals(expected, response);

    }

    @Test
    public void deveRetornarDB1Start() {
        String expected = "DB1START";
        String response = application.retornarDB1START();
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar4Letras() {
        String expected = "Patr";
        String response = application.retornar4Letras("Patricia Emy Shibata");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarDa4Letra() {
        String expected = "tricia Emy Shibata";
        String response = application.retornarDa4Letra("Patricia Emy Shibata");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar4UltimaLetra() {
        String expected = "bata";
        String response = application.retornar4UltimaLetra("Patricia Emy Shibata");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveSubstituirPrimeiroNome() {
        String expected = "Aluna Emy Shibata";
        String response = application.substituirAluna();
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarSequenciaDeLetrasSeparadas() {
        String[] expected = new String[]{"banana", "maçã", "melancia"};
        String[] response = application.retornarPalavrasSeparadas("banana, maçã, melancia");
        Assert.assertArrayEquals(expected, response);
    }
    @Test
    public void deveRetornarQuantidadeVogal() {
        Integer expected = 4;
        Integer response = application.quantidadeVogal("Patricia");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornarTextoInvertido() {
        String expected = "asac";
        String response = application.textoInvertido("casa");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarValorMenorDouble() {
        Double expected = 5.5;
        Double response = application.menorDouble(7.8,5.5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarValorMenorDoubleDe3() {
        Double expected = 3.8;
        Double response = application.menorDouble3(7.5,4.1,3.8);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarMedia() {
        Double expected = 4.5;
        Double response = application.media(6.5,2.5,4.5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarAreaDoTriangulo() {
        Double expected = 16.5;
        Double response = application.areaTriangulo(5.5, 6.0);
        Assert.assertEquals(expected, response);
    }




}