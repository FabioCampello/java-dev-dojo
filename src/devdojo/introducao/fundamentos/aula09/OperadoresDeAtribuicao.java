package devdojo.introducao.fundamentos.aula09;

public class OperadoresDeAtribuicao {

	// =, -=, +=, *=, /=, %=	
	public static void main(String[] args) {
		
		float salario = 1000f;
		salario = salario + 1000f;
		
		float salarioNovo = 1000f;
		salarioNovo += 1500f;
		
		System.out.println(salario);
		System.out.println(salarioNovo);
		System.out.println("Salário com 10%: " + (salarioNovo * 1.1));
		
	}
	
}
