package devdojo.aula11;

public class ExercicioControleFluxo1 {

	public static void main(String[] args) {
		
		double salario = 4000;
		double imposto = 0;
		
		if(salario < 1000) {
			imposto = salario * 0.05;
		} else if(salario >= 1000 && salario < 2000) {
			imposto = salario * 0.10;
		} else if(salario >= 2000 && salario < 4000) {
			imposto = salario * 0.15;
		} else {
			imposto = salario * 0.2;
		}
		System.out.println(imposto + "%");
		
	}
	
}
