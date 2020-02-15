package devdojo.introducao.fundamentos.aula11;

public class ControleFluxo1 {
	
	public static void main(String[] args) {
		
		int idade = 11;
		String categoria = "";
		
		categoria = (idade < 15) ? "categoria infantil" :  "categoria adulto"; 
		
		System.out.println(categoria);		
	}

}
