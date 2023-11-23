package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
        String c1 = sc.nextLine();
        sc.close();
        
        System.out.print("La frase contiene " + huecos(c1) + " espacios en blanco");

	}
	public static int huecos(String c1) {
		int contador = 0;
        for (int i = 0; i < c1.length(); i++) {
            if (Character.isWhitespace(c1.charAt(i))) {
                contador++;
            }
        }
        return contador;
	}
}