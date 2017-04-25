/**
 * 
 * Escribe un programa que, dado un n�mero entero, diga cu�les son y cu�nto
 * suman los d�gitos pares. Los d�gitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * n�meros largos.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio32 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca un n�mero entero positivo: ");
	    long numeroIntroducido = Long.parseLong(System.console().readLine());

	    //Le damos la vuelta al n�mero y calculamos la longitud.
	    long numero = numeroIntroducido;
	    long volteado = 0;
	    int longitud = 0;
	    
	    if (numero == 0) {
	      longitud = 1;
	    }
	    
	    while (numero > 0) {
	      volteado = (volteado * 10) + (numero % 10);
	      numero /= 10;
	      longitud++;
	    } 

	    //Mostramos los d�gitos pares.
	    System.out.print("D�gitos pares: ");

	    int digito;
	    int sumaPares = 0;
	    
	    for (int i = 0; i < longitud; i++) {

	      digito = (int)(volteado % 10);

	      if ((digito % 2) == 0) {
	        System.out.print(digito + " ");
	        sumaPares += digito;
	      }

	      volteado /= 10;
	    }
	    
	    //Aqu� mostramos la suma de los d�gitos pares 
	    System.out.println("\nSuma de los d�gitos pares: " + sumaPares);
		
	}
}
