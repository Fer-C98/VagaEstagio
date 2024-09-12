package com.target;

/*int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça
 { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA)
  Ao final do processamento, qual será o valor da variável SOMA? */


/*RESPOSTA: a variável "soma" será resultado do somatório dos números de 1 a 12, ou seja, 78. */

public class Ex3 {

    public static void main(String[] args) {
   
    int indice = 12;
    int soma = 0;
    int k = 0;

    while (k < indice){
        k = k+1;
        soma = soma + k;
    }

    System.out.println("O valor ao final do processamento será: "+ soma);

    }
}