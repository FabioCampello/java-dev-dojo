package devdojo.introducao.fundamentos.aula08;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int idade = 19;
		float salario = 999f;
		
		if(idade > 18 && salario > 1000) {
			System.out.println("Idade maior qu� 18 e salario maior qu� 1000.");
		} else if(idade < 18 && salario < 1000) {
			System.out.println("Idade menor qu� 18 e salario menor qu� 1000.");
		} else {
			System.out.println("Idade igual � " + idade + " e salario igual � " + salario + ".");
		}
		
	}
	
}
