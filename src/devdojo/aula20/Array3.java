package devdojo.aula20;

public class Array3 {
	
	public static void main(String[] args) {
		
		int[] numero1 = new int[5];
		int[] numero2 = {0, 1, 2, 3, 4, 5};
		int[] numero3 = new int[]{2, 4, 6, 8, 10, 12};
		
		for(int i = 0; i < numero2.length; i++) {
			  System.out.println("Número " + i + ": " + numero2[i]);
		}
		
		int i = 0;
		for(int aux: numero3) {
			System.out.println("Número " + i + ": " + aux);
			i++;
		}
		
	}

}
