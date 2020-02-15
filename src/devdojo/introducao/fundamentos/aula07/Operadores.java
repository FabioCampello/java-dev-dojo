package devdojo.introducao.fundamentos.aula07;

public class Operadores {

	public static void main(String[] args) {
		int numeroInteiro = 20;
		long numeroLong = 200000L;
		
		double numeroDouble = 10d;
		float numeroFloat = 20f;
		
		float castDoubleParaFloat = (float) numeroDouble;
		
		System.out.println(numeroInteiro);
		System.out.println(numeroLong);
		System.out.println(numeroDouble);
		System.out.println(numeroFloat);
		System.out.println(castDoubleParaFloat);
		
		System.out.println("Operador % " + (21 % 2));
		System.out.println("Operador % " + (20 % 2));
	}
	
}
