package devdojo.intermediario.aula25.classes;

public class Carro {

	private String placa;
	private String modelo;
	private float velocidadeMaxima;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", modelo=" + modelo + ", velocidadeMaxima=" + velocidadeMaxima + "]";
	}

}
