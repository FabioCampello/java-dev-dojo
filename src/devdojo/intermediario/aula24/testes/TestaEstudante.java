package devdojo.intermediario.aula24.testes;

import devdojo.intermediario.aula24.classes.Estudante;

public class TestaEstudante {

	public static void main(String[] args) {
		
		Estudante estudante1 = new Estudante();
		estudante1.setNome("João");
		estudante1.setMatricula("E225");
		estudante1.setIdade(17);
		
		System.out.println("Estudante: " + estudante1.toString());
		
	}
	
}
