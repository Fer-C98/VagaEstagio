package com.target;

import java.util.Scanner;


/*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será 
a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, 
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número 
informado pertence ou não a sequência. */


public class Ex1 {

    public static boolean pertenceFibonacci (int numero){
        int a = 0;
        int b = 1;
        int c = a + b;

        if (numero == 0){
            return true;
        } else { 
            while (c <= numero){
                if (c == numero){
                    return true;
                }else{
                    a = b;
                    b = c;
                    c = a + b;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {

        int num_informado; 

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número: ");
        num_informado = scan.nextInt();

        while (num_informado < 0){
            System.out.println("O número precisa ser maior que zero. Insira novamente: ");
            num_informado = scan.nextInt();
        }

        if (pertenceFibonacci(num_informado)){
            System.out.println("O número informado PERTENCE a sequência de Fibonacci!");
        } else {
            System.out.println("O número informado NÃO pertence a sequência de Fibonacci!");
        }

        scan.close();
    }
}