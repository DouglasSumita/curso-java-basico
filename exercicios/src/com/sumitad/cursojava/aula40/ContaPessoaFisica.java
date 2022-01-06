package com.sumitad.cursojava.aula40;

public class ContaPessoaFisica extends Conta {
    
	private String nome;
	private String cpf;
	private static final double TAXA_TRANSACIONAL = 1.5;
	
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
    
	public boolean creditar(double montante) {
		double montanteCreditar = montante;
		if (montante > 100.0 && montante < 1000.0) {
			// 50% da taxa
			montanteCreditar -= (montante * TAXA_TRANSACIONAL / 100 ) / 2;
		} else if (montante >= 1000.0) {
			// 1/4 da taxa
			montanteCreditar -= (montante * TAXA_TRANSACIONAL / 100 ) / 4;
		}
		
		return super.creditar(montanteCreditar);
	}
	
	@Override
	public String toString() {
		return "Conta Pessoa: Fisica, Nome: " + getNome() 
		       + ", cpf: " + getCpf()
		       + " " + super.toString();
	}
}
