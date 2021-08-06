/**
 * checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 * Cristian Omar Torres Chegue
 * 
 */

package Dev;

import java.util.Arrays;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
		
    boolean toReturn = true;
    
		if(a == null || b == null){ // Se Verifica que los arreglos no se encuentre sin valor o null
			return false;
		}
		
		if(a.length != b.length) { // Se Evalua la ambas Longitudes de los arreglos no sean diferente
			return false;
		}

		/**
		 * Una vez Evaluado los 2 Condicionales
		 * Entre el ciclo for en accion.
		 * Donde se va ir multiplicando el Arreglo con su misma valor
		 * Teniendo a b como maxico de iteraciones
		 *  
		 */
		
		for(int i=0; i<b.length; ++i) {
			a[i] = a[i]*a[i];
		}
		
		// Ordenamos de forma Acsendente
		Arrays.sort(a); Arrays.sort(b);

		/*
		 * Una  Vez Ordenados los elementos entra a otro ciclo
		 * El objetivo es ver su los Elementos de A y B son diferentes
		 * si es asi retorna falso
		 * Si no toReturn se mantiene en true
		 * 
		 * */
		
		for(int i=0; i<a.length; ++i)
			if(a[i] != b[i])
				return false;

		return toReturn;
  }
}