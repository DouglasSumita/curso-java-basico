package com.sumitad.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
	    Contato contato = new Contato();
        
	    contato.setNome("Douglas Sumita");
	    contato.setEndereco(new Endereco("Rua Nossa Senhora das Graças", "321", "Casa B", "Sarandi", "PR", "87114-577"));
	    
	    Telefone[] telefones = new Telefone[2];
	    
	    telefones[0] = new Telefone("Celular", "44", "99945-2284");
	    telefones[1] = new Telefone("Celular", "44", "99816-2201");
	    
	    for (Telefone telefone : telefones) {
	    	System.out.println(telefone.toString());
	    }
	    
	    contato.setTelefones(telefones);
	    
	    System.out.println(contato.toString());
	}
   
}
