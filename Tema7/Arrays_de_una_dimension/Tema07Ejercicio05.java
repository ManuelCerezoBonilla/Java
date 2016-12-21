/**
 * 
 * Escribe un programa que pida 10 n�meros por teclado y que luego muestre
 * los n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado
 * del m�ximo y del m�nimo respectivamente.
 * 
 * @author Manuel Cerezo
 *
 */
import java.util.Scanner;

public class Tema07Ejercicio05 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("En este programa, le pediremos que introduzca 10 n�meros por teclado.");
		System.out.print("\nLe mostraremos los 10 n�meros que ha introducido y tambi�n el valor m�ximo y m�nimo.");
		System.out.print("\n-------------------------------------------------------------------------------------");
		
		//Declaramos variables y array.
		int[] num = new int[10];
		
		int i;
		int contador = 10;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		
		//Empezamos con los bucles para pedir los n�meros y comprobar el m�ximo y el m�nimo.
		for(i = 0; i < 10; i++) {
			System.out.print("\nInserte un n�mero. Le quedan " + contador + " n�meros: ");
			num[i] = s.nextInt();
			contador--;
			
			if (num[i] < minimo) {
				minimo = num[i];
			} 
			
			if(num[i] > maximo) {
				maximo = num[i];
			}
			
			
		}
		
		
		//Mostramos por pantalla los valores del array introducidos por teclado y el m�ximo y m�nimo
		for(i = 0; i < 10; i++) {
			System.out.print("\n " + num[i]);
			
			if (num[i] == minimo) {
		        System.out.print(" m�nimo");
		    }
		      
		    if (num[i] == maximo) {
		        System.out.print(" m�ximo");
		    }
		}
		
		
	}
}
