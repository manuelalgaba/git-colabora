package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String c1 = sc.nextLine();
        
        String resultado = c1.replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
        
        System.out.println("La frase sin vocales es: " + resultado);
        
        sc.close();
	}
}