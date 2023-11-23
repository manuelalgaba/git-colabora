package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);

        System.out.println("Jugador Nº1 Introduzca una contraseña: ");
        String c1 = sc.nextLine();
        
        int longitud = c1.length();
        System.out.println("Longitud de la contraseña: " + longitud);
        
        char posicion = c1.charAt(0);
        System.out.println("El 1er caracter es: " + posicion);
        
        char posicion2 = c1.charAt(longitud - 1);
        System.out.println("El último caracter es: " + posicion2);
        
        System.out.println("Jugador Nº2 Intente adivinar la contraseña: ");
        String c2 = sc.nextLine();
        
        if (c1.equals(c2)) {
            System.out.println("Acertaste!!!");
        }
        else {
            System.out.println("Fallaste :(");
        }
        sc.close();
	}
}