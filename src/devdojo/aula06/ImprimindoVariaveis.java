 package devdojo.aula06;

public class ImprimindoVariaveis {

	public static void main(String[] args) {
		System.out.println("Aula06 - Imprimindo variáveis, continuação.");
		
		int idade = 10;
		double salarioDouble = 3000;
		float salarioFloat = 3000;
		byte idadeByte = 12;
		short idadeShort = 32767;
		boolean verdadeiro = true;
		boolean falso = false;
		long numeroGrande = 1000L;
		char caractere = 'A'; // CARACTERE aceita valor numéricop até 2 bytes	
		char caractereInt = 95;
		char caractereUnicode = '\u0041';
		
		String nome = "William";
		
		System.out.println(nome + " de idade " + idade);
		
		System.out.println("Caractere: " + caractere);
		System.out.println("CaractereInt: " + caractereInt);
		System.out.println("CaractereInt: " + caractereUnicode);
	}
	
}
