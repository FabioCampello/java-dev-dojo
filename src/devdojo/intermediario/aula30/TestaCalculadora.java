package devdojo.intermediario.aula30;

import devdojo.intermediario.aula30.Calculadora;

public class TestaCalculadora {

	public static void main(String[] args) {

		Calculadora c = new Calculadora();
		System.out.println("SOMA: " + c.somaDoisNumeros(5, 5));
		System.out.println("SUBTRA��O: " + c.subtraiDoisNumeros(5, 5));
		System.out.println("DIVIS�O: " + c.divideDoisNumeros(5, 0));
		System.out.println("MULTIPLICA��O: " + c.multiplicaDoisNumeros(5, 5));
		c.divideDoisNumerosVoid(10, 0);
	}

}
