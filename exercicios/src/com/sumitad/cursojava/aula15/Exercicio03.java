package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que se uma letra digitada é F ou M.
		 * Conforme a letra Escrever: F - Feminino, M - Masculino, Sexo inválido.
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
			result = "Sexo inválido";
		}
		
		System.out.println(result);
		scan.close();

	}

}
