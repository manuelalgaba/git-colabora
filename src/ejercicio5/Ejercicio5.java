package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);

        System.out.println("Introduce un número mayor a 2 dígitos: ");
        String c1 = sc.nextLine();
        
        System.out.println("Introduzca la posición donde quiere partir el numero: ");
        int posicion = sc.nextInt();
        
        String parte1 = c1.substring(0, posicion - 1);
        String parte2 = c1.substring(posicion - 1);
        
        System.out.println("El numero se divide entre " + parte1 + " y " + parte2);
        
        sc.close();
    }
}