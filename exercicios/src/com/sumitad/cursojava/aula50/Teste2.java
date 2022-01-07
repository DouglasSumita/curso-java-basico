package com.sumitad.cursojava.aula50;

public class Teste2 {
	public static void main(String[] args) {

		// Trabalhando com Exceptions genéricas

		int[] numeros = { 1, 50, 10, 20, 30, 50 };
		int[] denominadores = { 2, 0, 3, 0, 10 };

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Iteração: " + (i + 1));
			try {
				System.out.println(numeros[i] + " / " + denominadores[i] + " = " + numeros[i] / denominadores[i]);
			} catch (Exception e) {
                System.out.println("Erro genérico");
			} finally {
				System.out.println("Sempre é executado a não ser que aborte o programa!");
				System.out.println();
			}
		}
	}
}
