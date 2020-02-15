package devdojo.introducao.fundamentos.aula08;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int idade = 19;
		float salario = 999f;
		
		if(idade > 18 && salario > 1000) {
			System.out.println("Idade maior quê 18 e salario maior quê 1000.");
		} else if(idade < 18 && salario < 1000) {
			System.out.println("Idade menor quê 18 e salario menor quê 1000.");
		} else {
			System.out.println("Idade igual à " + idade + " e salario igual à " + salario + ".");
		}
		
	}
	
}
