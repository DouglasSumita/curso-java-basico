package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça um valor e mostre na tela se o valor é positivo 
		 * ou negativo 
		 */
         
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número e verifíque se ele é Negativo ou Positivo:");
		Double num = scan.nextDouble();
		
		if (num < 0) {
		    System.out.println("Negativo");	
		} else {
			System.out.println("Positivo");
		}
		
		scan.close();
	}

}
