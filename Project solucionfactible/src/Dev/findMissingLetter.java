package Dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 * Cristian Omar Torres Chegue
 */

public class findMissingLetter {
	
	public static char findMissingLetter(char[] array) {
		
		char expectableLetter = array[0]; // expectableLetter va hacer Igual al Arreglo de entrada
	    for(char letter : array) { // Se Inicia el ciclo con un foreach que va entrar array que es el arreglo entrante
	      if(letter != expectableLetter) break; // comprar el contenido de letter es distinto al existente en expectableLetter
	      // si es distinto entra en break y se retorna el valor de expectableLetter
	      expectableLetter++; // si se cumple aumenta en 1 a la siguiente posicion
	    }
	    
	    return expectableLetter; 
	  }
	
	
	
	}


