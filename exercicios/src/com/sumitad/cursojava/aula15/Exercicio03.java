package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que se uma letra digitada � F ou M.
		 * Conforme a letra Escrever: F - Feminino, M - Masculino, Sexo inv�lido.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra referente ao sexo:");
		char sexo = scan.next().charAt(0);
		String result;
		
		if(sexo == 'f' || sexo == 'F') {
			result = "F - Feminino";
		} else if(sexo == 'm' || sexo == 'M') {
			result = "M - Masculino";
		} else {
			result = "Sexo inv�lido";
		}
		
		System.out.println(result);
		scan.close();

	}

}
