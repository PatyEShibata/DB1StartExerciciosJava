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
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '1' | texto.charAt(i) == '2' | texto.charAt(i) == '3' | texto.charAt(i) == '4' | texto.charAt(i) == '5' | texto.charAt(i) == '6' | texto.charAt(i) == '7' | texto.charAt(i) == '8' | texto.charAt(i) == '9') {
                numero = numero + 1;
            }
        }
        return (texto.length() - numero);
    }

    public Integer quantidadeLetraEspaco() {
        Integer numero = 0;
        String texto = " DB1START ".trim();
        Integer total = texto.trim().length();
        for (int i = 0; i < total; i++) {
            if (texto.charAt(i) == '1' | texto.charAt(i) == '2' | texto.charAt(i) == '3' | texto.charAt(i) == '4' | texto.charAt(i) == '5' | texto.charAt(i) == '6' | texto.charAt(i) == '7' | texto.charAt(i) == '8' | texto.charAt(i) == '9') {
                numero = numero + 1;
            }
        }
        return (total - numero);
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
        Integer vogal = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a'| texto.charAt(i) == 'e'| texto.charAt(i) == 'i'| texto.charAt(i) == 'o'|texto.charAt(i) == 'u'){
                vogal ++;
            }
        }
        return (texto.length()-vogal);
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

