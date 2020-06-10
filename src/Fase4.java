/**
 * Fase4 - Ejercico de Variables
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

public class Fase4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String nom = "Rubén", cognom1 = "Rodríguez", cognom2 = "Fernández" ;
		int dia = 25, mes = 1, any = 1977 ;
		
		int anyTraspas = 1948;

		String siHoEs = "El meu any de naixement SI és un any de traspàs";
		String noHoEs = "El meu any de naixement NO és un any de traspàs";
		
		int traspas = 4;

		String nomComplert = nom + " "+ cognom1 + " " + cognom2 ;
		String dataNaixementString, mesString;
		
		//En cas que el mes sigui anterior a octubre, per mantenir un format homogeni, possem um 0
		if (mes < 10) mesString = "0"+mes;
		else
			mesString =  "" + mes;
		
		dataNaixementString = dia + "/"+mesString+"/"+any;
		
		System.out.println("El meu nom es " + nomComplert );
		System.out.println("Vaig néixer el " + dataNaixementString );
		
		
		//comprovem si l'any de naixement es un any de traspàs i ho guardem
		
		if ( (any-anyTraspas) % traspas == 0 ) 
			
			System.out.println(siHoEs);
		else
			System.out.println(noHoEs);
					
	}

}