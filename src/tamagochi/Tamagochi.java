package tamagochi;
import java.util.Scanner;

public class Tamagochi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal raca;		
		
		System.out.print("Qual bicho voce quer? ");
		System.out.println("1 Cachorro, 2 Gato, 3 Pagagaio");
		Integer escolha = sc.nextInt();
		
		if (escolha == 1) {
			raca = new Cachorro();
		}
		else if (escolha == 2) {
			raca = new Gato();
		}
		else {
			raca = new Papagaio();
		}
		
		System.out.println("Voce criou um " + raca.getTipo());
		
		while (raca.getSaude() > 0) {
			//Status do Bicho
			System.out.println("Saúde: " + raca.getSaude());
            System.out.println("Felicidade: " + raca.getFelicidade());
            System.out.println("Energia: " + raca.getEnergia());
            System.out.println("Higiene: " + raca.getHigiene());
            
            //Definindo o q o bicho vai fazer 
            System.out.println("O que deseja fazer?");
            System.out.println("1 Brincar");
            System.out.println("2 Banhar");
            System.out.println("3 Comer");
            System.out.println("4 Curar");
            System.out.println("5 Dormir");
            int opcao = sc.nextInt();
            
            //Chamando os metodos
            switch (opcao) {
            case 1: 
            	raca.Brincar();
            	System.out.println("Voce brincou com " + raca.getTipo());
            	break;
            case 2:
            	raca.Banho();
            	System.out.println("Voce banhou " + raca.getTipo());
            	break;
            case 3: 
            	raca.Comer();
            	System.out.println("Voce alimentou" + raca.getTipo());
            	break;
            case 4:
            	raca.Curar();
            	System.out.println("Voce curou" + raca.getTipo());
            	break;
            case 5:
            	raca.Dormir();
            	System.out.println("Voce colocou " + raca.getTipo() + " para dormir");
            	break;
            default: 
            	System.out.println("Opcao invalida tente novamente");
            	break;
            }
		}
		//Aqui anuncia que o seu bicho morreu
		System.out.println("Seu bicho morreu fim de jogo!");
		sc.close();
	}
	
}
