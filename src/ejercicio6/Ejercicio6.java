package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);

        System.out.println("Introduce un número mayor a 2 dígitos: ");
        String c1 = sc.nextLine();
        
        System.out.println("Introduzca la posición donde quiere insertar (Mínimo 1): ");
        int posicion = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Introduzca el dígito que quiere insertar: ");
        String digito = sc.nextLine();

        String parte1 = c1.substring(0, posicion - 1);
        String parte2 = c1.substring(posicion - 1);

        System.out.println("El número final es: " + parte1 + digito + parte2);

        sc.close();
    }
}