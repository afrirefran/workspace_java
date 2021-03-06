
// Avion hereda de Vehiculo
public class Avion extends Vehiculo {

	// atributos
	private boolean trenAterrizaje;
	
	// m�todos
	public void volar() {}
	public void aterrizar() {}

	// constructor de la clase Avion
	public Avion(float velocidad, int asientos, int orientacionRuedas, boolean trenAterrizaje) {
		
		// invocaci�n al constructor de la superclase (Vehiculo)
		super(velocidad, asientos, orientacionRuedas);
		
		System.out.println("Constructor de la clase Avion");		
		this.trenAterrizaje = trenAterrizaje;
	}
	
	public void acelerar() {
		System.out.println("M�todo acelerar de Avion");		
	}
	
	// m�todo get para trenAterrizaje
	public boolean isTrenAterrizaje() {
		return trenAterrizaje;
	}
	// m�todo set para trenAterrizaje
	public void setTrenAterrizaje(boolean trenAterrizaje) {
		this.trenAterrizaje = trenAterrizaje;
	}
	
	
}
