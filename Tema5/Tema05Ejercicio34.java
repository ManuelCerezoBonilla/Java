/**
 * 
 * Escribe un programa que pida dos n�meros por teclado y que luego mezcle en
 * dos n�meros diferentes los d�gitos pares y los impares. Se van comprobando
 * los d�gitos de la siguiente manera: primer d�gito del primer n�mero, primer
 * d�gito del segundo n�mero, segundo d�gito del primer n�mero, segundo
 * d�gito del segundo n�mero, tercer d�gito del primer n�mero� Para facilitar
 * el ejercicio, podemos suponer que el usuario introducir� dos n�meros de la
 * misma longitud y que siempre habr� al menos un d�gito par y uno impar. Usa
 * long en lugar de int donde sea necesario para admitir n�meros largos.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio34 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
	    System.out.print("Por favor, introduzca un n�mero: ");
	    long numeroIntroducido1 = Long.parseLong(System.console().readLine());

	    System.out.print("Introduzca otro n�mero: ");
	    long numeroIntroducido2 = Long.parseLong(System.console().readLine());

	    //Volteamos el primer n�mero y calculamos la longitud
	    long numero = numeroIntroducido1;
	    long volteado1 = 0;
	    int longitud = 0;
	    
	    if (numero == 0) {
	      longitud = 1;
	    }
	    
	    while (numero > 0) {
	      volteado1 = (volteado1 * 10) + (numero % 10);
	      numero /= 10;
	      longitud++;
	    } 

	    //Volteamos el segundo n�mero
	    numero = numeroIntroducido2;
	    long volteado2 = 0;
	    
	    while (numero > 0) {
	      volteado2 = (volteado2 * 10) + (numero % 10);
	      numero /= 10;
	    }

	    //Recorre los dos n�meros volteados para formar los dos resultados
	    long resultadoPares = 0;
	    long resultadoImpares = 0;
	    int digito;
	    
	    for (int i = 0; i < longitud; i++) {

	      digito = (int)(volteado1 % 10);

	      if ((digito % 2) == 0) {
	        resultadoPares = resultadoPares * 10 + digito;
	      } else {
	        resultadoImpares = resultadoImpares * 10 + digito;
	      }

	      digito = (int)(volteado2 % 10);

	      if ((digito % 2) == 0) {
	        resultadoPares = resultadoPares * 10 + digito;
	      } else {
	        resultadoImpares = resultadoImpares * 10 + digito;
	      }

	      volteado1 /= 10;
	      volteado2 /= 10;
	    }
	    
	    //Mostramos el resultado final.
	    System.out.println("El n�mero formado por los d�gitos pares es: " + resultadoPares);
	    System.out.println("El n�mero formado por los d�gitos impares es: " + resultadoImpares);
	}
}
