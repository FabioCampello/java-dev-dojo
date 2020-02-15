package devdojo.introducao.arrays.aula18;

public class Arrays1 {
	
	public static void main(String[] args) {
		int[] idades1 = new int[5]; // 1ª forma
		idades1[0] = 1;
		idades1[1] = 2;
		idades1[2] = 3;
		idades1[3] = (int) 2.5f;
		idades1[4] = 5;
		
		System.out.println(idades1[0]);
		System.out.println(idades1[1]);
		System.out.println(idades1[2]);
		System.out.println(idades1[3]);
		System.out.println(Double.parseDouble(String.valueOf(idades1[4])));
		
	}

}
