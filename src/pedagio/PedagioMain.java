package pedagio;

import java.util.ArrayList;
import java.util.List;

public class PedagioMain {
	public static void main(String[] args) {
		List <Veiculo> veiculos = new ArrayList<>(); 
		
		try {
		    Carro carro1 = new Carro("ABA456", "Gol", 80);
		    veiculos.add(carro1);
		} catch (VelocidadeExcedidaException e) {
		    System.out.println(e.getMessage());
		}

		try {
			Caminhao cam1 = new Caminhao("ACD123", "Scania", 100, 3);
			veiculos.add(cam1);
		} catch (VelocidadeExcedidaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Viatura v1 = new Viatura("EFG234", "Hilux", 80,  "Policia");
			veiculos.add(v1);
		} catch (VelocidadeExcedidaException e ) {
			System.out.println(e.getMessage());
		}
		double total = 0;
		
		for(Veiculo v: veiculos) {
			System.out.println("=====================");
			v.exibirInformacoes();
			
			if(v instanceof Pagavel) {
				double tarifa = ((Pagavel) v).calcularTarifa();
				System.out.println("Tarifa R$" + tarifa);
				total = total + tarifa;
			} else {
				System.out.println("Seu veiculo nao precisa pagar pedagio!");
			}
		}
		System.out.println("=====================");
		System.out.println("O total arrecadado no pedagio foi: " + total);	
	}
}
