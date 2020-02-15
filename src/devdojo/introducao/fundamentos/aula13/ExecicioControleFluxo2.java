package devdojo.introducao.fundamentos.aula13;

public class ExecicioControleFluxo2 {

	public static void main(String[] args) {
		
		int dia = 2;
		String semana;
		
		switch(dia) {
			case 1: 
			case 7:{
				semana = "Final de semana.";
				break;
			} 
			case 2:
			case 3:
			case 4:
			case 5:	
			case 6: {
				semana = "Dia útil.";
				break;
			}
			default: {
				semana = "Dia inválido.";
				break;
			}
		}
		System.out.println(semana);
	}
	
}
