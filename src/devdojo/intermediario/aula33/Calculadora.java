package devdojo.intermediario.aula33;

public class Calculadora {
	
	public int somaFor(int[] numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}
	
	public int somaForEach(int[] numeros) {
		int soma = 0;
		for(int num: numeros) {
			soma += num;
		}
		return soma;
	}
	
	public int somaVarArgs1(int...numeros) {
		int soma = 0;
		for(int num: numeros) {
			soma += num;
		}
		return soma;
	}
	
	public void somaVarArgs2(String texto, int...numeros) {
		int soma = 0;
		for(int num: numeros) {
			soma += num;
		}
		System.out.println(texto + ": " + soma);
	}

}
