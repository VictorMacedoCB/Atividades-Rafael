package pedagio;

public class Carro extends Veiculo implements Pagavel {
	public Carro(String placa, String modelo, double velocidadeAtual ) throws VelocidadeExcedidaException {
		super(placa, modelo, velocidadeAtual);
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Placa: " + this.placa);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Velocidade atual: " + this.velocidadeAtual);
	}
	
	@Override
	public double calcularTarifa() {
		return 7;
	}
}
