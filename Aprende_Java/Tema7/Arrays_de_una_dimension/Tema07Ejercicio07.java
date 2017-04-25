/**
 * 
 * Escribe un programa que genere 100 n�meros aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedir� entonces
 * por teclado dos valores y a continuaci�n cambiar� todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los n�meros
 * que se han cambiado deben aparecer entrecomillados.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Ejercicio07 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int[] num = new int[100];
		
		
		int i;
		
		//
		for(i = 0; i < 100; i++) {
			num[i] = (int)(Math.random() * 21);
			System.out.print(num[i] + " ");
		}//Fin del primer bucle for
		
		System.out.print("\nA continuaci�n, escriba un n�mero de los que ha mostrado.");
		int numA = s.nextInt();
		System.out.print("\nEscriba el n�mero por el que quiere sustituirlo.");
		int numB = s.nextInt();
		
		System.out.println();
		
		for(i = 0; i < 100; i++) {
			if(num[i] == numA) {
				num[i] = numB;
				System.out.print("\"" + numB + "\" ");
			} else {
				System.out.print(num[i] + " ");
			}
		}
		
		
	}
}
