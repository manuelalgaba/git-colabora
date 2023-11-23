package ejercicio12segundo;

import java.util.Scanner;

public class Ejercicio12segundo {

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
        
        int comparacion = c2.compareTo(c1);
        
        
        while (comparacion != 0) {
        if (comparacion > 0) {
            System.out.println("Fallaste :( La contraseña es menor");
            c2 = sc.nextLine();
            comparacion = c2.compareTo(c1);
        }
        else if (comparacion < 0){
            System.out.println("Fallaste :( La contraseña es mayor");
            c2 = sc.nextLine();
            comparacion = c2.compareTo(c1);
        	}
        }
        if (comparacion == 0) {
            System.out.println("Acertaste!!!");
        }
        sc.close();
	}
}