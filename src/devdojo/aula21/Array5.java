package devdojo.aula21;

public class Array5 {
	
	public static void main(String[] args) {
		
		int[][] dias = new int[2][2];
		
		dias[0][0] = 1;
		dias[0][1] = 25;
		dias[1][0] = 3;
		dias[1][1] = 45;
		
		for(int i = 0; i < dias.length; i++) {
			System.out.print(dias[i] + " - ");
			for(int j = 0; j < dias[i].length; j++) {
				System.out.print("[" + dias[i][j] + "]");
			}
			System.out.print("\n");
		}
		
		System.out.println("---------------------");
		
		for(int[] ref: dias) {
			for(int dia: ref) {
				System.out.print("[" + dia + "]");
			}
			System.out.print("\n");
		}
		
	}

}
