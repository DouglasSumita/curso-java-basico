package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que verifique se a letra digitada � Vogal ou Consoante.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra e verifique se � Vogal ou Consoante:");
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
