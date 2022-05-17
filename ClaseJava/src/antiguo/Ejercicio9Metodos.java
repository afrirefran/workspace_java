package antiguo;
import java.util.Scanner;

public class Ejercicio9Metodos {
	
	public static int sumar(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		return resultado;
	}
	
	public static int restar(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		return resultado;
	}
	
	public static int multiplicar(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		return resultado;
	}
	
	public static int dividir(int numero1, int numero2) {
		int resultado = numero1 / numero2;
		return resultado;
	}

	public static void main(String[] args) {

		/*
		 * Implementar m�todos restar, multiplicar y dividir. Tienen que devolver un entero
		 * (int). Invocar los tres m�todos con los dos n�meros introducidos por el usuario
		 * y mostrar el resultado por pantalla
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduzca el primer n�mero: ");
		int numero1 = keyboard.nextInt();
		
		System.out.print("Introduzca el segundo n�mero: ");
		int numero2 = keyboard.nextInt();
		
		System.out.print("Introduzca operacion: 1=+, 2=-, 3=*, 4=/ ");
		int operacion = keyboard.nextInt();
		
		// si el usuario ha introducido la operaci�n de suma
		if(operacion == 1) {	// suma
			int resultadoSuma = Ejercicio9Metodos.sumar(numero1, numero2);
			System.out.println(resultadoSuma);
		}
		else if(operacion == 2) {	// resta
			int resultadoResta = Ejercicio9Metodos.restar(numero1, numero2);
			System.out.println(resultadoResta);
		}
		else if(operacion == 3) {	// multiplicaci�n
			int resultadoMultiplicar = Ejercicio9Metodos.multiplicar(numero1, numero2);
			System.out.println(resultadoMultiplicar);
		}
		else if(operacion == 4) { // dividir
			int resultadoDividir = Ejercicio9Metodos.dividir(numero1, numero2);
			System.out.println(resultadoDividir);
		}
		else {
			System.out.println("No existe la operaci�n");
		}	
	}
	
	
}
