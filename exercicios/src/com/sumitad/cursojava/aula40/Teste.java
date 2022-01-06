package com.sumitad.cursojava.aula40;

public class Teste {
    
	public static void main(String[] args) {
		
		ContaPessoaFisica contaPessoaFisica = new ContaPessoaFisica("Douglas Sumita", "090.123.456-12", 1234, 4, 654, 0.0, 100.0, 100.0);
		ContaPessoaJuridica contaPessoaJuridica = new ContaPessoaJuridica("Java Systems LTDA", "80.123.456/0001-50", 1233, 1, 654, 100.0, 10000.0, 10000.0);
	    
		System.out.println(contaPessoaFisica);	
	    System.out.println(contaPessoaJuridica);	
	    
	    contaPessoaFisica.creditar(200.0);
	    contaPessoaJuridica.creditar(200.0);
	    
	    System.out.println();
	    System.out.println("Valor atualizado:");
		System.out.println(contaPessoaFisica.getInfoSaldo());	
	    System.out.println(contaPessoaJuridica.getInfoSaldo());	
	    
	    if (contaPessoaFisica.debitar(250.0)) {
	    	System.out.println("Debito não autorizado");
	    }
	    
	    if (contaPessoaJuridica.debitar(350.0)) {
	    	System.out.println("Debito não autorizado");
	    }
	    
	    System.out.println();
	    System.out.println("Valor atualizado:");
		System.out.println(contaPessoaFisica.getInfoSaldo());	
	    System.out.println(contaPessoaJuridica.getInfoSaldo());
	}	
    
}
