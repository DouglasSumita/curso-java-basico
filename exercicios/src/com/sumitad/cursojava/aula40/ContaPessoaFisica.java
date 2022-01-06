package com.sumitad.cursojava.aula40;

public class ContaPessoaFisica extends Conta {
    
	private String nome;
	private String cpf;
	
	public ContaPessoaFisica(String nome, String cpf, int conta, int digitoConta, int agencia,
		double saldo, double limiteChequeEspecial, double saldoChequeEspecial) {
		
		super(conta, digitoConta, agencia, saldo, limiteChequeEspecial, saldoChequeEspecial);
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Conta Pessoa: Fisica, Nome: " + getNome() 
		       + ", cpf: " + getCpf()
		       + " " + super.toString();
	}
}
