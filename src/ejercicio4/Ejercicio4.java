package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
        String c1 = sc.nextLine();
        
        int mitad = c1.length() / 2;
        
        String resultado = c1.substring(0, mitad) + "<>" + c1.substring(mitad);
        
        System.out.println(resultado);
        
        sc.close();
	}
}