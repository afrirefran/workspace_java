package antiguo;

public class Main2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Bucle while
		 */
		
		int edad = 16;
		while(edad <= 18) {
			System.out.println("Estoy dentro del while");
			
			// edad = edad + 1
			edad++;
			
			break;
		}
		
//		System.out.println(edad);
		
		/*
		 * Bucle do-while
		 */
		
		int edad2 = 18;
		do {
			System.out.println(edad2);
			edad2++;
		} while(edad2 < 19);
		
	}

}
