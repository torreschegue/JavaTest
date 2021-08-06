package Dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 * Cristian Omar Torres Chegue
 */

public class Persistence {
	
	
	 
	 /*
	  *  El metodo Persistence Practicamente recibe numero desde 1 dijito hasta de 9 dijitos en base al test
	  *  Haciendo uso de 2 metodo valueOf y toCharArray
	  *  
	  * */
	
	public static int persistence(long num) {
		
		int result = 0; // result es quien lleva el conteo de las veces que se tiene que multicar el num entrante
		while (num > 9) { // verifica de num es de un solo dijito
			long multi = 1; // se Inicializa multi en 1 para que valla multiplicando elemento a elemento
			for (char t : String.valueOf(num).toCharArray()) { // Una Vez Recibi el valor que traer num si convierte en un arreglo de caracteres donde se toma la primera posicion del arreglo en cada iteracion con la variable t
				multi *= Long.parseLong(String.valueOf(t)); // una vez obtenido el primer elemento este se convierte a long y se asigna su nuevo valor a multi
			}
			num = multi; // Se asigna el nuevo valor que tendra num para su nueva iteracion
			result++; // result aumenta en +1 llevando el control de las veces multiplicadas
		}
		return result; // una vez terminando el ciclo regresa el valor de multiplicaciones que se hizo por elemento
	}

}
