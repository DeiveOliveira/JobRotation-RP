/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobrotation.rp;

import java.util.Scanner;

/**
 *
 * @author deive
 */
public class Exercicio_05 {
    
    public static String inverte(String palavra){
        String aux= "";
        
       int tamanho = palavra.length();
        for(int i = (tamanho-1); i>=0; i--){
            aux = aux + palavra.charAt(i);
        }
        return aux;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Informe uma String:");
        String palavra = sc.nextLine();
        
        System.out.println("");
        
        System.out.println("Entrada: " + palavra);
        System.out.println("Saida: " + inverte(palavra));
    }
    
}
