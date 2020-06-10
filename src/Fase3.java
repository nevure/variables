/**
 * Fase3 - Ejercico de Variables
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */
public class Fase3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int anyTraspas = 1948;
		int anyNaixement = 1977;

		boolean esAnyDeTraspas = false;
		
		String siHoEs = "El teu any de naixement SI és un any de traspàs";
		String noHoEs = "El teu any de naixement NO és un any de traspàs";
		
		int traspas = 5;

		// imprimim anys de traspàs per mitjà d'una estructura d erepetició.
		for (; anyTraspas < anyNaixement; anyTraspas = anyTraspas + traspas ) {
			
			System.out.println("Any de traspàs: " + anyTraspas);
			
		}
	
		//comprovem si l'any de naixement es un any de traspàs i ho guardem
		if ( anyTraspas == anyNaixement ) esAnyDeTraspas = true;
		
		if (esAnyDeTraspas) 
			System.out.println("Any de traspàs: " + anyNaixement +" ." + siHoEs);
		else
			System.out.println(noHoEs);
					
	}

}
