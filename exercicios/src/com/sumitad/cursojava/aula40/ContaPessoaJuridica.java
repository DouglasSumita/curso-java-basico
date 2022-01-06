package com.sumitad.cursojava.aula40;

public class ContaPessoaJuridica extends Conta {
    
	private String razaoSocial;
	private String cnpj;
	
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

	@Override
	public String toString() {
		return "Conta Pessoa: Juridica, Razao Social: " + getRazaoSocial() 
		       + ", cnpj: " + getCnpj() 
		       + " " + super.toString();
	}
	
	
}
