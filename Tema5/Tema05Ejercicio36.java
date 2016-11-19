/**
 * 
 * Escribe un programa que diga si un n�mero introducido por teclado es o no
 * capic�a. Los n�meros capic�a se leen igual hacia delante y hacia atr�s. El
 * programa debe aceptar n�meros de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dar� por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite n�meros m�s largos.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio36 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca un n�mero entero positivo: ");
	    long numeroIntroducido = s.nextLong();

	    //Volteamos el n�mero introducido por teclado.
	    long numero = numeroIntroducido;
	    long volteado = 0;

	    while (numero > 0) {
	      volteado = (volteado * 10) + (numero % 10);
	      numero /= 10;
	    } 
	    
	    if (volteado == numeroIntroducido) {
	      System.out.println("El " + numeroIntroducido + " es capic�a");
	    } else {
	      System.out.println("El " + numeroIntroducido + " no es capic�a");
	    }
	}
}