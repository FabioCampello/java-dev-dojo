package devdojo.intermediario.aula25.teste;

import devdojo.intermediario.aula25.classes.Professor;

public class TestaProfessor {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor();
		professor1.setNome("Prof. Girafales");
		professor1.setMatricula("C1212");
		professor1.setRg("9576423");
		professor1.setCpf("654852483");
		
		System.out.println(professor1.toString());
		
	}
	
}
