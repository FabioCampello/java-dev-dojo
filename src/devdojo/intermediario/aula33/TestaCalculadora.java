package devdojo.intermediario.aula33;

public class TestaCalculadora {
	
	private static final String SOMA = "Soma: ";
	
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		int[] array1 = {1, 4, 7};
		int[] array2 = {1, 4, 7, 4, 9};
		
		int somaFor = c.somaFor(array1);
		int somaForEach = c.somaForEach(array2);
		int somaVarAgrs1 = c.somaVarArgs1(array1);
		
		System.out.println(SOMA + somaFor);
		System.out.println(SOMA + somaForEach);
		System.out.println(SOMA + somaVarAgrs1);
		c.somaVarArgs2("Soma VARAGRS",2, 5, 8);
		
	}

}
