package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/* 
		 * Faça um programa que peça dois números e imprima o maior deles.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Número:");
		Double numA = scan.nextDouble();
		
		System.out.println("Digite o segundo Número:");
		Double numB = scan.nextDouble();
		
		String result = "O maior número: ";
		if (numA > numB) {
			result += numA;
		} else {
			result += numB;
		}
		
		System.out.println(result);
		scan.close();

	}

}
