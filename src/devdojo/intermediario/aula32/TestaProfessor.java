package devdojo.intermediario.aula32;

public class TestaProfessor {

	public static void main(String[] args) {
		
		Professor p1 = new Professor();
		p1.setCpf("234.765.094-12");
		p1.setMatricula("34593485");
		p1.setNome("Thiago");
		p1.setRg("3245673453456");
		p1.imprimeProfessor();
		
		Professor p2 = new Professor();
		p2.setCpf("123.465.235-43");
		p2.setMatricula("25423942");
		p2.setNome("Mateus");
		p2.setRg("344141246");
		p2.imprimeProfessor();
	}
	
}
