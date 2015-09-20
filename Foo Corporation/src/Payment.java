import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Este programa te ayudara a calcular la paga del empleado");
		
		double basePay = 0.0;
		double hours = 0.0;
		double payment = 0.0;
		double maxHours = 40.0;
		
		Scanner user_input = new Scanner (System.in);
		System.out.println("Ingresa el salario base");
			basePay = user_input.nextDouble();
		System.out.println("Ingresa las horas trabajadas");
			hours = user_input.nextDouble();
		
		if (basePay<8.0) { 
			hours = -1;
			System.out.println("Incrementar Salario");
		}
		else {
			
		}
	if (hours<0){
		System.out.println("Salario debe ser igual o mayor a 8 dolares");
	}
	else {
		if (hours<=40.0) {
			payment = hours*basePay;
			System.out.println("La paga del trabajador por las-" + hours + "-horas trabajadas es de $" + payment + "dolares" );
		}
		else {
			if (hours<=60.0) {
				
				payment = (maxHours*basePay) + ((hours-40)*(basePay*1.5));
				System.out.println("La paga del trabajador por las" + hours + "-horas trabajadas es de $" + payment + "dolares" );
			}
			else {
				System.out.println("Demasiadas Horas");
			}
		}
	}
			
		
		
	}

}
