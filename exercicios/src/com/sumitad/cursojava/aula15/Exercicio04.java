package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que verifique se a letra digitada é Vogal ou Consoante.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra e verifique se é Vogal ou Consoante:");
		String letra = scan.next();
		
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
        	letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
        	letra.equalsIgnoreCase("u")) {
        	
        	System.out.println("Vogal: " + letra);
        } else {
        	System.out.println("Consoante: " + letra);
        }
        
		scan.close();

	}

}
