package com.target;

import java.util.Scanner;

/* Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.*/

public class Ex2 {

    public static void main(String[] args) {

        String palavra;

        System.out.println("CONTADOR DE LETRA 'A' ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra de sua preferência: ");
        palavra = scan.nextLine();

        char[] caracteres = palavra.toCharArray();
        int i = 0;
        int letra = 0;

        while (i < caracteres.length){
            if(caracteres[i] == 'a' || caracteres[i] == 'A'){
                letra = letra +1;
            }
            i = i+1;
        }
        if (letra == 0){
            System.out.println("A palavra digitada não possui nenhuma letra 'a' e/ou 'A'");
        } else {
            System.out.println("A palavra digitada possui "+ letra + " letras 'a' e/ou 'A'");
        }

        scan.close();
    }
}