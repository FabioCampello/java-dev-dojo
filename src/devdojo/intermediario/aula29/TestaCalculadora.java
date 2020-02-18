package devdojo.intermediario.aula29;

public class TestaCalculadora {
	
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		System.out.println("SOMA: " + c.somaDoisNumeros(5, 5));
		System.out.println("SUBTRAÇÃO: " + c.subtraiDoisNumeros(5, 5));
		System.out.println("DIVISÃO: " + c.divideDoisNumeros(5, 5));
		System.out.println("MULTIPLICAÇÃO: " + c.multiplicaDoisNumeros(5, 5));
		
	}

}
