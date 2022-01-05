package com.sumitad.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
	    Contato contato = new Contato();
        
	    contato.setNome("Douglas Sumita");
	    contato.setEndereco(new Endereco("Rua Nossa Senhora das Graças", "321", "Casa B", "Sarandi", "PR", "87114-577"));
	    contato.setTelefone("44 99945-2284");
	    
	    System.out.println(contato.toString());
	}
   
}
