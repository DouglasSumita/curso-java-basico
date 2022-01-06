package com.sumitad.cursojava.aula40;

public class Conta {
    
	private int conta;
	private int digitoConta;
	private int agencia;
	private double saldo;
	private double limiteChequeEspecial;
	private double saldoChequeEspecial;

	public Conta() {
	}

	public Conta(int conta, int digitoConta, int agencia, double saldo,
			     double limiteChequeEspecial, double saldoChequeEspecial) {
		this.conta = conta;
		this.digitoConta = digitoConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limiteChequeEspecial = limiteChequeEspecial;
		this.saldoChequeEspecial = saldoChequeEspecial;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getDigitoConta() {
		return digitoConta;
	}

	public void setDigitoConta(int digitoConta) {
		this.digitoConta = digitoConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public double getSaldoChequeEspecial() {
		return saldoChequeEspecial;
	}

	private void creditarChequeEspecial(double montante) {
		this.saldoChequeEspecial += montante;
	}
	

	private void debitarChequeEspecial(double montante) {
		this.saldoChequeEspecial -= montante;
	}

	private void creditarSaldo(double montante) {
	
		this.saldo += montante;
	}
	
	private void debitarSaldo(double montante) {
		this.saldo -= montante;
	}
	
	public boolean creditar(double montante) {
		
		double valorChequeEspecialEmUso = getLimiteChequeEspecial() - getSaldoChequeEspecial();
		
		if (valorChequeEspecialEmUso != 0D) {
			if (montante > valorChequeEspecialEmUso) {
				creditarChequeEspecial(valorChequeEspecialEmUso);
				montante -= valorChequeEspecialEmUso;
			}
		}
		
		creditarSaldo(montante);
		return true;
	}
	
	public boolean debitar(double montante) {
		
		if (!podeRetirarMontante(montante)) {
			return false;
		}
		
		if (montante <= getSaldo()) {
			debitarSaldo(montante);
		} else {
			double valorRetirarChequeEspecial = montante - getSaldo();
			debitarChequeEspecial(valorRetirarChequeEspecial);
            debitarSaldo(montante - valorRetirarChequeEspecial);
		}
		
		return true;
	}
	
	private boolean podeRetirarMontante(double montante) {
		return montante <= getSaldo() + getSaldoChequeEspecial();
	}

	@Override
	public String toString() {
		return "Conta: " + getConta() + '-' + getDigitoConta()
				+ ", agencia: " + getAgencia() 
				+ ", saldo: R$ " + String.format("%.2f", getSaldo()) 
				+ ", limite Cheque Especial: R$ " + String.format("%.2f", getLimiteChequeEspecial()) 
				+ ", saldo Cheque Especial: R$ " + String.format("%.2f", getSaldoChequeEspecial());
	}
	
	public String getInfoSaldo() {
		
		String infoChequeEspecial = ""; 
		double valorEmUsoChequeEspecial = getLimiteChequeEspecial() - getSaldoChequeEspecial();
		
		if (getSaldo() == 0D && valorEmUsoChequeEspecial != 0D) {
			infoChequeEspecial = "Cheque Especial em USO, valor R$: " + valorEmUsoChequeEspecial;
		}
		
		return "Saldo: R$ " + getSaldo()
		       + " " + infoChequeEspecial
		       + ", Saldo Cheque Especial: R$ " + getSaldoChequeEspecial()
		       + ", Limite Cheque Especial: R$ " + getLimiteChequeEspecial();
	}
	
}
