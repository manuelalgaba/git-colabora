package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
        String c1 = sc.nextLine();
        
        boolean longitudPar = c1.length() % 2 == 0;
        int posicionCentral = longitudPar ? (c1.length() / 2) - 1 : c1.length() / 2;
        char caracterCentral = c1.charAt(posicionCentral);
        
        boolean esEspacio = caracterCentral == ' ';
        
        if (esEspacio) {
            System.out.println("El carácter en la posición central es un espacio.");
        } else {
            System.out.println("El carácter en la posición central NO es un espacio.");
        }
        sc.close();
	}
}
