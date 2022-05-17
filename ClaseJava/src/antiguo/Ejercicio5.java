package antiguo;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que calcule el factorial de un n�mero a partir
		 * de un n�mero introducido por el usuario
		 */
		
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("Introduzca un n�mero: ");
//		int numero = keyboard.nextInt();
		
//		int resultado = 400;
		
		// incrementa en 1
//		resultado++;
//		System.out.println(resultado);
		
		/*
		 * Primera iteraci�n
		 * - i se inicializa a 1
		 * - se eval�a la condici�n
		 * 
		 * Segunda iteraci�n y siguientes
		 * - i se incrementa en uno (i++)
		 * - se eval�a la condici�n
		 */
		
		int resultado = 1;
		for (int i=1; i<=6; i++) {
			System.out.println(i);			
			resultado = resultado * i;
		}
		System.out.println(resultado);			
		
		
		
		
//		keyboard.close();
	}

}
