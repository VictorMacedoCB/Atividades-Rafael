package exercicio.excecao.contas;

public class Teste {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(300, 200);
		try {
			System.out.println("Saldo de inicio " + conta.getSaldo());
			System.out.println("Saldo com limite " + conta.getSaldoComLimite());
			
			conta.depositar(300);
			System.out.println("Saldo com deposito " + conta.getSaldo());
			conta.sacar(200);
			System.out.println("Saldo com saque " + conta.getSaldo());
		} catch (ContaExpection e) {
			System.out.println(e.getMessage());
		}
		try {
			conta.sacar(500);
		}
		catch (ContaExpection e){
			System.out.println(e.getMessage());
		}
	}
}
