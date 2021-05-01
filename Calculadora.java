import java.util.Scanner;

public class Calculadora {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String respuesta;
		int menu;
		float n1;
		float n2;
		
		do {
			System.out.println("Introduzca el primer numero:");
			n1 = sc.nextFloat();
			
			System.out.println("Introduzca el segundo numero:");
			n2 = sc.nextFloat();
			
			System.out.println("MENU DE OPERACIONES");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			menu = sc.nextInt();
			
			if(menu==1) {
				float suma = n1 + n2;
				System.out.println(n1+ " + " + n2+" = "+suma);
				
			} else if(menu==2) {
				float resta = n1 - n2;
				System.out.println(n1+ " - " + n2+" = "+resta);
				
			} else if(menu==3) {
				float multi = n1 * n2;
				System.out.println(n1+ " * " + n2+" = "+multi);
				
			}else if(menu==4) {
				float divi = n1 / n2;
				System.out.println(n1+ " / " + n2+" = "+divi);
				
			} else {
				System.out.println("Error");
			}
			
			System.out.println("Desea realizar otra operacion?");
			respuesta = sc.next();
			
		} while(respuesta.equalsIgnoreCase("s"));
			
	}
}
