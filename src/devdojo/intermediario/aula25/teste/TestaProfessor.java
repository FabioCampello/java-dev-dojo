package devdojo.intermediario.aula25.teste;

import devdojo.intermediario.aula25.classes.Professor;

public class TestaProfessor {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor();
		professor1.setNome("Prof. Girafales");
		professor1.setMatricula("C1212");
		professor1.setRg("9576423");
		professor1.setCpf("654852483");
		
		Professor professor2 = new Professor();
		professor2.setNome("Prof. Pardal");
		professor2.setMatricula("T5364");
		professor2.setRg("68124587523");
		professor2.setCpf("854210357");
		
		System.out.println(professor1.toString());
		System.out.println(professor2.toString());
		
	}
	
}
