package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class CalculadoraReajusteSalarial {

	public static void main(String[] args) {
        /*
         * As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
         * - Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
         * - Salários até R$ 280 (incluindo): aumento de 20%
         * - Salários entre R$ 280 e R$ 700: aumento de 15%
         * - Salários entre R$ 700 e R$ 1500: aumento de 10%
         * - Salários de R$ 1500 em diante: aumento de 5% 
         * - Após o aumento ser realizado, informar na tela:
         * - Salário antes do resjute;
         * - o percentual de aumento aplicado;
         * - o valor do aumento;
         * - o novo salário, após o aumento.
         */
         
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Salário atual:");
		Double salarioAtual = scan.nextDouble();
		Integer percAumento = 0;
		
		if (salarioAtual <= 280) {
			percAumento = 20;
		} else if (salarioAtual <= 700) {
			percAumento = 15;
		} else if (salarioAtual <= 1500) {
			percAumento = 10;
		} else {
			percAumento = 5;
		}
		
		Double valorAumento = (salarioAtual * percAumento / 100);
	    Double salarioNovo = salarioAtual + valorAumento;
	    
	    System.out.println("Salário antes do resjute: " + salarioAtual);
	    System.out.println("Percentual de aumento aplicado: " + percAumento);
	    System.out.println("Valor do aumento: " + valorAumento);
	    System.out.println("Novo salário: " + salarioNovo);
	    
		scan.close();		
				
	}

}
