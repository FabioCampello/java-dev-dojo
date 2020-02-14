package devdojo.aula17;

public class ControleFluxo {

	public static void main(String[] args) {
		
		double valorCarro = 30000;
		
		for(int parcela = 1; parcela <= valorCarro; parcela++) {
			double valorParcela = valorCarro / parcela;
			if(valorParcela >= 1000) {
				System.out.println("Parcela " + parcela + " R$ " + valorParcela);
			}
		}
		
	}
	
}
