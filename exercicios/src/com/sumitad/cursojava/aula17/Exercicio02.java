package com.sumitad.cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia o nome de usuário e sua senha e não aceite a senha igual 
		 * ao nome de usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
		 */

		Scanner scan = new Scanner(System.in);
		boolean valido = false;
		
		do {
			
			System.out.println("Digite o nome de usuário:");
			String usuario = scan.next();
			
			System.out.println("Digite a senha:");
			String senha = scan.next();
			
			valido = !usuario.equals(senha);
			
			if (!valido) {
				System.out.println("A senha não pode ser igual ao usuário, digite novamente!");
			} else {
				System.out.println("Senha e usuário válidos");
			}
		} while (!valido);
		
		scan.close();
	}

}
