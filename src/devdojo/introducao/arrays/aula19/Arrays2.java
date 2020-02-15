package devdojo.introducao.arrays.aula19;

public class Arrays2 {
	
	public static void main(String[] args) {
		// VALORES PADRÕES DE ARRAY INSTÂNCIADOS NULOS
		// byte, short, long, int, float, double = 0
		// char '\u0000' -> ' ' VÁZIO
		// boolean = false
		// reference = null
		
		byte[] array1 = new byte[2];
		short[] array2 = new short[2];
		long[] array3 = new long[2];
		int[] array4 = new int[2];
		float[] array5 = new float[2];
		double[] array6 = new double[2];
		char[] char1 = new char[2];
		String[] string1 = new String[2];
		boolean[] boolean1 = new boolean[2];
		
		int[] gaveta = new int[2]; 
		gaveta[0] = 100;
		gaveta[1] = 5;
		
		int numero = 5;
		
		String[] nomesAnimes = new String[3];
		nomesAnimes[0] = "Naruto";
		nomesAnimes[1] = "Goku";
		nomesAnimes[2] = "Luffy";
		
		System.out.println("Array1: " + array1[0]);
		System.out.println("Array2: " + array2[0]);
		System.out.println("Array3: " + array3[0]);
		System.out.println("Array4: " + array4[0]);
		System.out.println("Array5: " + array5[0]);
		System.out.println("Array6: " + array6[0]);
		
		System.out.println("Número: " + numero);
		
		System.out.println("");
		
		System.out.println("Gaveta posição 1: " + gaveta[0]);
		System.out.println("Gaveta posição 2: " + gaveta[1]);
		System.out.println("Char 1: " + char1[0]);
		System.out.println("Char 1: " + char1[0]);
		System.out.println("String 1: " + string1[0]);
		System.out.println("Boolean 1: " + boolean1[0]);
		
		for(int count = 0; count<nomesAnimes.length; count++) {
			System.out.println("Nome " + count + ": " + nomesAnimes[count]);
		}
		
	}

}
