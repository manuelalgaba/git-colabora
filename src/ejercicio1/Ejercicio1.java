package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
        String p1 = sc.nextLine();
        
        System.out.println("Introduce otra palabra: ");
        String p2 = sc.nextLine();
        
        comparativa(p1, p2);
        sc.close();

	}
	//Este metodo llamado comparativa recibe como parametros de entrada dos Strings llamados p1 y p2, no devuelve nada y muestra por pantalla cual cadena es mayor, menor o igual.
	public static void comparativa(String p1, String p2) {
		int longitud1 = p1.length();
		int longitud2 = p2.length();
		
		if (longitud1 > longitud2) {
			System.out.println("La cadena mas pequeña es la segunda");
		}
		else if (longitud1 < longitud2) {
			System.out.println("La cadena mas pequeña es la primera");
		}else
			System.out.println("Ambas palabras son igual de grandes");
	}
		
}
