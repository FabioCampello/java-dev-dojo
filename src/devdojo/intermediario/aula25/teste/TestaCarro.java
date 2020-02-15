package devdojo.intermediario.aula25.teste;

import devdojo.intermediario.aula25.classes.Carro;

public class TestaCarro {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.setModelo("Jeep Renegate");
		carro1.setPlaca("OIA-2366");
		carro1.setVelocidadeMaxima(125);
		
		System.out.println("Carro: " + carro1);
		
	}

}
