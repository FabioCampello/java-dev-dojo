package devdojo.intermediario.aula24.classes;

public class Estudante {

	private String nome;
	private String matricula;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + "]";
	}

}
