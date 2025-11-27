package pedagio;

public abstract class Veiculo  {
	protected String placa;
	protected String modelo;
	protected double velocidadeAtual;
	
	public Veiculo  (String placa, String modelo, double velocidadeAtual) throws VelocidadeExcedidaException {
		this.placa = placa;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		
		if (velocidadeAtual > 100) {
			throw new VelocidadeExcedidaException("Velocidade maior que o permitido");
		}
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public abstract void exibirInformacoes();
}
