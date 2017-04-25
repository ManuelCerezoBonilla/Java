/**
 * 
 * Realiza un programa que pida 8 n�meros enteros y que luego muestre esos
 * n�meros junto con la palabra �par� o �impar� seg�n proceda.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Ejercicio09 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("En este programa, le pediremos 8 n�meros enteros.");
		System.out.print("\nEl programa mostrar� por pantalla los n�meros y especificar� si es par o impar.");
		System.out.print("\n-----------------------------------------------------------------------------");
		s.nextLine();
		
		//Declaramos el array y las variables que vamos a necesitar.
		int[] num = new int[8];
		int i;
		int contador = 8;
		
		//Primer bucle para pedir los n�meros necesarios. El contador es algo est�tico.
		for(i = 0; i < 8; i++) {
			System.out.print("Introduzca el n�mero que desee. Le quedan " + contador + " n�meros por introducir:");
			num[i] = s.nextInt();
			contador--;
		}
		
		//Este segundo bucle muestra los valores del array por pantalla, adem�s de especificar si el n�mero es par o impar.
		for(i = 0; i < 8; i++) {
			System.out.print("\n" + num[i]);
			if (num[i] % 2 == 0) {
				System.out.print(" --> Par");
			} else {
				System.out.print(" --> Impar");
			}
		}
	}
}
