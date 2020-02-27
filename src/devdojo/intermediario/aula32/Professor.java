package devdojo.intermediario.aula32;

public class Professor {

	private String nome;
	private String matricula;
	private String rg;
	private String cpf;

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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", matricula=" + matricula + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
	public void imprimeProfessor() {
		System.out.println("***************************");
		System.out.println(this.getCpf());
		System.out.println(this.getMatricula());
		System.out.println(this.getNome());
		System.out.println(this.getRg());
	}

}
