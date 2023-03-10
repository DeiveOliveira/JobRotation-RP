/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.jobrotation.rp;

/**
 *
 * @author deive
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author deive
 */
public class Exercicio_02 {

    public static int[] fibonacci(int tamanho) {
        int fibo[] = new int[tamanho];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= fibo.length - 1; i++) {
            int aux1 = i - 1;
            int aux2 = i - 2;

            fibo[i] = fibo[aux1] + fibo[aux2];
        }
        return fibo;
    }

    public static int buscaBinaria(int fibo[], int numero) {
        int i, m, f;
        i = 0;
        f = fibo.length - 1;
        while (i <= f) {
            m = (i + f) / 2;
            if (fibo[m] == numero) {
                return m;
            }
            if (numero < fibo[m]) // esquerda
            {
                f = m - 1;
            } else // x > v[m] - direita
            {
                i = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero inteiro que deseja buscar: ");
        int numero = sc.nextInt();
        
        int busca = buscaBinaria(fibonacci(numero), numero);
        
        if(busca >=0){
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci e é o " + (busca+1) + "° da sequência");
        }
        else{
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }
    }
}
