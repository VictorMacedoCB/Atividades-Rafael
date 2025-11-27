package pedagio;

public class Caminhao extends Veiculo implements Pagavel {
	protected Integer eixos;
	
	public Caminhao(String placa, String modelo, double velocidadeAtual, Integer eixos) throws VelocidadeExcedidaException {
		super(placa, modelo, velocidadeAtual);
		this.eixos = eixos;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Placa: " + this.placa);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Velocidade atual: " + this.velocidadeAtual);
		System.out.println("Numero de eixos: " + this.eixos);
		
	}
	
	@Override
	public double calcularTarifa() {
		return 7 * this.eixos;
	}
}
