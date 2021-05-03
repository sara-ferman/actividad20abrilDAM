import java.util.Scanner;

public class Calculadora {
	public static void main(String [] args) {
		repetirOperacion();
	}
	
	public static void repetirOperacion() {
		Scanner scanner = new Scanner(System.in);
		String respuesta;
		float numero1 = 0;
		float numero2 = 0;
		
		do {
			System.out.println("Introduzca el primer numero:");
			numero1 = scanner.nextFloat();
			
			System.out.println("Introduzca el segundo numero:");
			numero2 = scanner.nextFloat();
			
			menuOperaciones(numero1, numero2);
			
			System.out.println("Desea realizar otra operacion?");
			respuesta = scanner.next();
			
		} while(respuesta.equalsIgnoreCase("s"));
	}
	
	public static void menuOperaciones(float numero1, float numero2) {
		Scanner scanner = new Scanner(System.in);
		int eleccionMenu = 0;
		
		System.out.println("MENU DE OPERACIONES");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		eleccionMenu = scanner.nextInt();
		
		if(eleccionMenu==1) {
			float suma = numero1 + numero2;
			System.out.println(numero1+ " + " + numero2+" = "+suma);
			
		} else if(eleccionMenu==2) {
			float resta = numero1 - numero2;
			System.out.println(numero1+ " - " + numero2+" = "+resta);
			
		} else if(eleccionMenu==3) {
			float multiplicacion = numero1 * numero2;
			System.out.println(numero1+ " * " + numero2+" = "+multiplicacion);
			
		}else if(eleccionMenu==4) {
			float division = numero1 / numero2;
			System.out.println(numero1+ " / " + numero2+" = "+division);
			
		} else {
			System.out.println("Error");
		}
	}
}
