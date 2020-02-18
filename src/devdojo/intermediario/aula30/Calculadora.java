package devdojo.intermediario.aula30;

public class Calculadora {
	
	public int somaDoisNumeros(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtraiDoisNumeros(int num1, int num2) {
		return num1 - num2;
	}
	
	public int divideDoisNumeros(int num1, int num2) {
		if(num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}
	
	public void divideDoisNumerosVoid(int num1, int num2) {
		if(num2 != 0) {
			System.out.println(num1 / num2);
			return;
		} 
		System.out.println("Não é possível dividir por zero!");
	}
	
	public int multiplicaDoisNumeros(int num1, int num2) {
		return num1 * num2;
	}

}
