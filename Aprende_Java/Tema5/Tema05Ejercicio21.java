/**
 * 
 * Realiza un programa que vaya pidiendo n�meros hasta que se introduzca un
 * numero negativo y nos diga cuantos n�meros se han introducido, la media de
 * los impares y el mayor de los pares. El n�mero negativo s�lo se utiliza para
 * indicar el final de la introducci�n de datos pero no se incluye en el c�mputo.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio21 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("En este programa, de los numeros positivos introducidos se har�:\nLa media de los impares y se mostrar� el mayor de los pares.");
		System.out.print("\n--------------------------------------------------------------------");
		System.out.print("\nIntroduzca los n�meros que desee: ");
		System.out.print("\nSi desea parar, introduzca un n�mero negativo.");
		
		int numeroIntroducido;
		int cantidadDeNumerosIntroducidos = 0;
		int sumaNumerosImpares = 0;
		int cantidadDeNumerosImpares = 0;
		int numeroMaximoPar = 0;
		
		do {
			numeroIntroducido = s.nextInt();
			
			if (numeroIntroducido >= 0) {
				cantidadDeNumerosIntroducidos++;
				if ((numeroIntroducido % 2) == 1) { //Esto sirve para conocer si el numero es impar.
					sumaNumerosImpares += numeroIntroducido;
					cantidadDeNumerosImpares++;
				} else { //Si no es impar, lo declaramos como par. Y justo debajo almacenamos el resultado del numeroMaximoPar.
					if (numeroIntroducido > numeroMaximoPar)
					numeroMaximoPar = numeroIntroducido;
				}
			}
				
		} while (numeroIntroducido > 0);
		
		//Ahora mostramos por pantalla todos los resultados
		 System.out.println("Usted ha introducido un total de " + cantidadDeNumerosIntroducidos + " numeros");
		 System.out.println("La media de los numeros impares que ha introducido es de: " + sumaNumerosImpares / cantidadDeNumerosImpares);
		 System.out.println("El n�mero m�ximo de los pares introducidos es: " + numeroMaximoPar);
		
	}
}
