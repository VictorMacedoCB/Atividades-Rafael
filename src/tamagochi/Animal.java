package tamagochi;

public class Animal {
	String tipo;
	Integer energia;
	Integer saude;
	Integer felicidade;
	Integer higiene;
	//Metodo construtor pra inicializar os atributos
	public Animal(String tipo) {
		this.tipo = tipo;
		this.energia = 50;
		this.saude = 50;
		this.higiene = 50;
		this.felicidade = 50;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getEnergia() {
		return energia;
	}
	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	public Integer getSaude() {
		return saude;
	}
	public void setSaude(Integer saude) {
		this.saude = saude;
	}
	public Integer getFelicidade() {
		return felicidade;
	}
	public void setFelicidade(Integer felicidade) {
		this.felicidade = felicidade;
	}
	public Integer getHigiene() {
		return higiene;
	}
	public void setHigiene(Integer higiene) {
		this.higiene = higiene;
	}
	//Criando os metodos
	public void Brincar() {
		this.felicidade += 15;
		this.energia -= 15;
		this.higiene -= 5;
		validar();
	}
	
	public void Dormir() {
		this.energia += 50;
		this.felicidade -= 5;
		this.higiene -=5;
		validar();
	}
	
	public void Comer() {
		this.energia += 25;
		this.felicidade += 5;
		this.higiene -= 10;
		validar();
	}
	
	public void Curar() {
		this.saude += 20;
		this.felicidade -= 15;
		validar();
	}
	
	public void Banho() {
		this.higiene += 30;
		this.felicidade -= 10;
		validar();
	}
	
	//Validando os atributos impedindo eles de ficarem negativos e retirando de outros caso cheguem a 0
	private void validar() {
		if (this.energia < 0) {
			this.energia = 0;
		}
		if (this.felicidade < 0){
			this.felicidade = 0;
		}
		if (this.higiene < 0) {
			this.higiene = 0;
		}
		if (this.energia == 0) {
			this.saude -= 15;
		}
		if (this.felicidade == 0) {
			this.saude -= 20;
		}
		if (this.higiene == 0) {
			this.saude -= 25;
		}
		
		if(this.saude <= 0) {
			this.saude = 0;
		}
	}
}
