package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo 
		 * ou negativo 
		 */
         
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero e verif�que se ele � Negativo ou Positivo:");
		Double num = scan.nextDouble();
		
		if (num < 0) {
		    System.out.println("Negativo");	
		} else {
			System.out.println("Positivo");
		}
		
		scan.close();
	}

}
