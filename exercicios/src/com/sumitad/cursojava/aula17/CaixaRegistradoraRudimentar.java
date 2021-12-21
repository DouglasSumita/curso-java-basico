package com.sumitad.cursojava.aula17;

import java.util.Locale;
import java.util.Scanner;

public class CaixaRegistradoraRudimentar {

	public static void main(String[] args) {
    /*
     * Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber 
     * um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero 
     * deve ser informado pelo operador para indicar o final da compra. O programa deve então 
     * mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para 
     * então calcular e mostrar o valor do troco.
     * Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra.
     */
     
	Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Lojas Tabajara");
    
    Double preco = 0.0;
    Integer contador = 1;
    Double total = 0.0;
    
    do {
    	System.out.print("Produto " + contador + ": R$ ");
    	preco = scan.nextDouble();
    	
    	total += preco;
    	contador++;
    	
    	if (total > 0.0 && preco == 0.0) {  
    		
    		System.out.println("Total: R$ " + String.format("%.2f", total));
    		System.out.print("Dinheiro: R$ ");
    		Double pagamento = scan.nextDouble();
    		
    		System.out.println("Troco: R$ " + String.format("%.2f", pagamento - total));
    		
    		total = 0.0;
    		contador = 1;
    		System.out.println();
    	    System.out.println("Lojas Tabajara");
    	}
    	
    } while (!preco.equals(-1.0));
    
    System.out.println("Obrigado pela preferência!");
    scan.close();

	}

}
