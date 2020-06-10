/**
 * Fase3 - Ejercico de Variables en JavaScript
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

let anyTraspas = 1948
let anyNaixement = 1977
let esAnyDeTraspas = false
let siHoEs = "El teu any de naixement SI és un any de traspàs"
let noHoEs = "El teu any de naixement NO és un any de traspàs"
let traspas = 9;



// imprimim anys de traspàs per mitjà d'una estructura d erepetició.
for (; anyTraspas < anyNaixement; anyTraspas = anyTraspas + traspas ) {
		
	console.log("Any de traspàs: " + anyTraspas)
		
}

//comprovem si l'any de naixement es un any de traspàs i ho guardem
if ( anyTraspas == anyNaixement ) esAnyDeTraspas = true
		
if (esAnyDeTraspas) 
	console.log("Any de traspàs: " + anyNaixement +" ." + siHoEs)
else
	console.log(noHoEs);

