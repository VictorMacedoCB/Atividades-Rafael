package exercicio.excecao.contas;

public class ContaBancaria {
	private Double saldo;
	private Double limite;
	
	public ContaBancaria (double valorSaldo, double valorLimite) {
		this.saldo = valorSaldo;
		this.limite = valorLimite;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	protected Double getLimite() {
		return limite;
	}
	
	public  Double getSaldoComLimite(){
		return this.saldo + this.limite;
	}
	public boolean sacar(double valor) throws ContaExpection{
		if(valor >= 500) {
			throw new ContaExpection("O valor do saque nao pode ser superior a 500");
		}
		if(valor > getSaldoComLimite()) {
			throw new ContaExpection("O valor não é suficiente para saque");
		}
		this.saldo -= valor;
		return true;
	}
	
	public void depositar(double valor) throws ContaExpection {
		if (valor > 1000) {
			throw new ContaExpection("Não é possivel depositar mais de 1000 R$");
		}
		this.saldo += valor;
		System.out.println("Seu saque de " + valor  + " foi feito com sucesso");
	}
}
