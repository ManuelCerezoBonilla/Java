/**
 * 
 * Realiza un programa que pida un n�mero por teclado y que luego muestre ese
 * n�mero al rev�s.
 * 
 * @author Manuel
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio25 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un n�mero por teclado, el cu�l se le devolver� al rev�s: ");
		int numeroIntroducido = s.nextInt();
		
		int numero = numeroIntroducido;
		int alReves = 0;
		
		while (numero > 0) {
			alReves = (alReves * 10) + (numero % 10);
			numero /= 10;
		}
		
		System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + alReves);
				
	}
}
