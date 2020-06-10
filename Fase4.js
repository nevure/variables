/**
 * Fase4 - Ejercico de Variables en JavaScript
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

let nom = "Rubén", cognom1 = "Rodríguez", cognom2 = "Fernández" 
let	dia = 25, mes = 1, any = 1977
		
let anyTraspas = 1948
let siHoEs = "El meu any de naixement SI és un any de traspàs"
let noHoEs = "El meu any de naixement NO és un any de traspàs"
let traspas = 4
let nomComplert = nom + " "+ cognom1 + " " + cognom2 

console.log("El meu nom es " + nomComplert )

//Valorem possar un 0 per un mes anterior a octubre
if (mes < 10) 
	console.log("Vaig néixer el " + dia + "/0"+mes+"/"+any)
else 	console.log("Vaig néixer el " + dia + "/"+mes+"/"+any)

	
//calculem si l'any de naixement es un any de traspàs		
if ( (any-anyTraspas) % traspas == 0 ) 
			
	console.log(siHoEs)
else
	console.log(noHoEs)
					
