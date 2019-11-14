package com.db1.db1start;

import java.util.Scanner;

public class Exercicios {

    public Integer soma(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

    public Integer subtracao(Integer numero1, Integer numero2) {
        return numero1 - numero2;
    }

    public Integer multiplicacao(Integer numero1, Integer numero2) {
        return numero1 * numero2;
    }

    public Integer divisao(Integer numero1, Integer numero2) {
        return numero1 / numero2;
    }

    public Boolean par(Integer numero) {
        if (numero % numero == 0) {
            return true;
        }
        return false;

    }

    public Integer maior(Integer numero1, Integer numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    public Integer quantidadeImpar(Integer numero) {
        if (numero % 2 == 0) {
            return numero / 2;
        } else {
            return (numero + 1) / 2;
        }
    }

    public String letrasMaiuscula(String texto) {
        return texto.toUpperCase();
    }

    public String letrasMinuscula(String texto) {
        return texto.toLowerCase();
    }

    public Integer quantidadeLetra() {
        Integer numero = 0;
        String texto = "DB1START";
        return texto.replaceAll("[0-9]", "").length();
    }

    public Integer quantidadeLetraEspaco() {
        Integer numero = 0;
        String texto = " DB1START ".trim();
        return texto.replaceAll("[0-9]", "").length();
    }

    public String retornarDB1START (){
        String texto = " DB1START";
        return texto.trim();
    }

    public String retornar4Letras(String nome){
        return nome.substring(0,4);
    }

    public String retornarDa4Letra(String nome){
        return nome.substring(2);
    }

    public String retornar4UltimaLetra(String nome){
        return nome.substring(nome.length()-4);
    }

    public String substituirAluna(){
        String nome = "Patricia Emy Shibata";
        return nome.replace("Patricia", "Aluna");
    }

    public String [] retornarPalavrasSeparadas (String texto){
        return texto.split(", ");
    }

    public Integer quantidadeVogal(String texto) {
        return texto.replaceAll("[^(a|e|i|o|u)]", "").length();
    }

    public String textoInvertido (String texto){
        StringBuilder builder = new StringBuilder(texto);
        return builder.reverse().toString();
    }

    public Double menorDouble (Double numero1, Double numero2){
        if (numero1 < numero2){
            return numero1;
        }
        return numero2;
    }
    public Double menorDouble3 (Double numero1, Double numero2,Double numero3){
        if (numero1 < numero2  && numero1 < numero3){
            return numero1;
        }else if(numero2 < numero1 && numero2 < numero3){
            return numero2;
        }else
        return numero3;
    }

    public Double media(Double numero1, Double numero2,Double numero3){
        return (numero1+numero2+numero3)/3;
    }

    public Double areaTriangulo (Double base, Double altura){
        return (base*altura)/2;
    }


}

