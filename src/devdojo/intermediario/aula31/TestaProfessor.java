package devdojo.intermediario.aula31;

public class TestaProfessor {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor();
		prof1.setCpf("123.123.123-12");
		prof1.setMatricula("11122");
		prof1.setNome("Marcos");
		prof1.setRg("122211-5");
		
		Professor prof2 = new Professor();
		prof2.setCpf("522.235.543-12");
		prof2.setMatricula("08347230");
		prof2.setNome("Glauber");
		prof2.setRg("39743957-6");
		
		System.out.println("Professor 01 - Classe de Teste: " + prof1.toString());
		System.out.println("Professor 02 - Classe de Teste: " + prof2.toString());
		
		prof1.imprimeProfessor(prof1);
		prof1.imprimeProfessor(prof2);
		
		
		
	}
	
}
