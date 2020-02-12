package devdojo.aula13;

public class ControleFluxo3 {

	public static void main(String[] args) {
		// char, int, byte, enum e String
		byte dia = 9;
		String semana = "";

		switch (dia) {
			case 1: {
				semana = "Domingo";
				break;
			}
			case 2: {
				semana = "Segunda";
				break;
			}
			case 3: {
				semana = "Terça";
				break;
			}
			case 4: {
				semana = "Quarta";
				break;
			}
			case 5: {
				semana = "Quinta";
				break;
			}
			case 6: {
				semana = "Sexta";
				break;
			}
			default: {
				semana = "opção inválida";
				break;
			}
		}
		System.out.println(semana);
	}

}
