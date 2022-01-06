package com.sumitad.cursojava.aula40;

public class ContaPessoaJuridica extends Conta {
    
	private String razaoSocial;
	private String cnpj;
	private static final double TAXA_TRANSACIONAL = 0.3;

	public ContaPessoaJuridica(String razaoSocial, String cnpj, int conta, int digitoConta, 
			int agencia, double saldo, double limiteChequeEspecial, double saldoChequeEspecial) {
		
		super(conta, digitoConta, agencia, saldo, limiteChequeEspecial, saldoChequeEspecial);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    
	public boolean creditar(double montante) {
		return super.creditar(montante - (montante * TAXA_TRANSACIONAL / 100));
	}
	
	@Override
	public String toString() {
		return "Conta Pessoa: Juridica, Razao Social: " + getRazaoSocial() 
		       + ", cnpj: " + getCnpj() 
		       + " " + super.toString();
	}
	
	
}
