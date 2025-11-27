package pedagio;

public class Viatura extends Veiculo {
	
	protected String tipo;
	
	public Viatura (String placa, String modelo, double velocidadeAtual, String tipo) throws VelocidadeExcedidaException {
		super(placa, modelo, velocidadeAtual);
		this.tipo = tipo;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Placa: " + this.placa);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Velocidade atual: " + this.velocidadeAtual);
		System.out.println("Tipo: " + this.tipo);
		
	}
}
