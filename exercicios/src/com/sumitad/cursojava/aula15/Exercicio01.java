package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/* 
		 * Fa�a um programa que pe�a dois n�meros e imprima o maior deles.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro N�mero:");
		Double numA = scan.nextDouble();
		
		System.out.println("Digite o segundo N�mero:");
		Double numB = scan.nextDouble();
		
		String result = "O maior n�mero: ";
		if (numA > numB) {
			result += numA;
		} else {
			result += numB;
		}
		
		System.out.println(result);
		scan.close();

	}

}
