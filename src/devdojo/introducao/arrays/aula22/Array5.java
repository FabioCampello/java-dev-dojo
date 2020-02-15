package devdojo.introducao.arrays.aula22;

public class Array5 {

	public static void main(String[] args) {
		
		int[][] dias = new int[3][];
		
		dias[0] = new int[2];
		dias[1] = new int[3];
		dias[2] = new int[4];
		
		// int[][] dias = {{0, 0}, {1, 2, 3}, {0, 0, 0, 0}};
		// Qual � o valor da posi��o [1][2] = ?
		// O valor � igual: 3
		
		for(int[] ref: dias) {
			for(int dia: ref) {
				System.out.print("[" + dia + "]");
			}
			System.out.println("\n");
		}
	}
	
}
