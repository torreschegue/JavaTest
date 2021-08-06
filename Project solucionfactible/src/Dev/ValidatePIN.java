package Dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 * Cristian Omar Torres Chegue
 * 
 */

public class ValidatePIN {
	
	public static boolean isValid(String pin) { // Declaramos un Metodo Boolean que recibe un parametro pin
		
		int size = pin.length(); // size: sera igual al tamaño que se obteba del PIN Enviado como Argumento
        if (size!=4 && size!= 6) // Evalua si es tamaño distinto de 4 y de 6
        	return false;  // Si esta se cumple Regresa False de lo contrario
        
        for (int i = 0; i < size; i++) { //  Entra en ciclo donde de evalidar si son puros digitos entre el 0 y 9
            int character=pin.charAt(i); // character se le asigna el valor de pin y se evalua caracter por caracter 
            if(character<48 || 58<character)
            	return false; // Si no se cumple dicha condision se regresa una respuesta falsa.
        }
        return true; // Una Vez terminado el ciclo donde se evalua Character y regresa una respuesta verdadera
	}
}

/*
 * Dentro del ciclo existe una condicion,  (if(character<48 || 58<character))
 * los valores de 48 y 58 se tomaran en base al numero ASCII de los valores
 * de entre 0 y 9, Ejemplo:
 * El  Valor 49 corresponde al numero 1
 * El  Valor 50 corresponde al numero 2
 * 
 * */
 