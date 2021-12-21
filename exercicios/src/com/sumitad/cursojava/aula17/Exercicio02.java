package com.sumitad.cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia o nome de usu�rio e sua senha e n�o aceite a senha igual 
		 * ao nome de usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es.
		 */

		Scanner scan = new Scanner(System.in);
		boolean valido = false;
		
		do {
			
			System.out.println("Digite o nome de usu�rio:");
			String usuario = scan.next();
			
			System.out.println("Digite a senha:");
			String senha = scan.next();
			
			valido = !usuario.equals(senha);
			
			if (!valido) {
				System.out.println("A senha n�o pode ser igual ao usu�rio, digite novamente!");
			} else {
				System.out.println("Senha e usu�rio v�lidos");
			}
		} while (!valido);
		
		scan.close();
	}

}
