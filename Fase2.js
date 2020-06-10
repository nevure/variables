/**
 * Fase2 - Ejercico de Variables en JavaScript
 * @author Rubén Rodríguez
 * IT Academy
 * Barcelona Activa
 *
 */

const INICI_TRASPAS = 1948;
let traspas = 4;
let anysDeTraspas;
let anyNaixement = 1977

// Càlcul dels anys de traspàs 
anysDeTraspas = Math.floor(( anyNaixement - INICI_TRASPAS ) / traspas) 
			
//imprimim per pantalla el resultat:
console.log(" Anys de traspas entre " + INICI_TRASPAS + " i l'any de naixement, " + anyNaixement + ", son: " + anysDeTraspas) 
