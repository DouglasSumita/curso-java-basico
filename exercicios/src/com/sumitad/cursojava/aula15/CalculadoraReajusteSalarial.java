package com.sumitad.cursojava.aula15;

import java.util.Scanner;

public class CalculadoraReajusteSalarial {

	public static void main(String[] args) {
        /*
         * As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contrataram para desenvolver o programa que calcular� os reajustes.
         * - Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
         * - Sal�rios at� R$ 280 (incluindo): aumento de 20%
         * - Sal�rios entre R$ 280 e R$ 700: aumento de 15%
         * - Sal�rios entre R$ 700 e R$ 1500: aumento de 10%
         * - Sal�rios de R$ 1500 em diante: aumento de 5% 
         * - Ap�s o aumento ser realizado, informar na tela:
         * - Sal�rio antes do resjute;
         * - o percentual de aumento aplicado;
         * - o valor do aumento;
         * - o novo sal�rio, ap�s o aumento.
         */
         
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Sal�rio atual:");
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
	    
	    System.out.println("Sal�rio antes do resjute: " + salarioAtual);
	    System.out.println("Percentual de aumento aplicado: " + percAumento);
	    System.out.println("Valor do aumento: " + valorAumento);
	    System.out.println("Novo sal�rio: " + salarioNovo);
	    
		scan.close();		
				
	}

}
