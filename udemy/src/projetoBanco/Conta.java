package projetoBanco;

public class Conta {

	private int conta;
	private String nome;
	private double saldo;

	public Conta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getConta() {
		return conta;
	}

	public void deposito(double valorDeposito) {
		this.saldo += valorDeposito;
		System.out.println("Valor de deposito: R$ " + valorDeposito + " | Saldo atualizado para: R$ " + this.saldo + "\n");
	}

	public void sacar(double valorSaque) {
		this.saldo -= (valorSaque + 5); // 5 de taxa de saque
		System.out.println("Valor de saque: R$ " + valorSaque + " | Saldo atualizado para: R$ " + this.saldo + "\n");
	}

	
	@Override
	public String toString() {
		return "Conta: " + conta + "| nome: " + nome + " | " + " Saldo: R$ " + this.saldo;
	}

}
