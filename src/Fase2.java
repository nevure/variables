/**
 * Fase2 - Ejercico de Variables
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
public class Fase2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final short INICI_TRASPAS = 1948;
		
		short anyNaixement = 1977;
		byte traspas = 5;
		byte anysDeTraspas;
		
		// Càlcul dels anys de traspàs 
		
		anysDeTraspas = (byte) (( anyNaixement - INICI_TRASPAS ) / traspas );
			
		//imprimim per pantalla el resultat:
		
		System.out.println(" Anys de traspas entre " + INICI_TRASPAS + " i l'any de naixement, " + anyNaixement + ", son: " + anysDeTraspas );
			
	}

}
