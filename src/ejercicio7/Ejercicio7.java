package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String c1 = sc.nextLine();
        
        System.out.print("Frase Invertida: " + invertirCadena(c1));
        
        sc.close();
	}
	public static String invertirCadena(String c1) {
		StringBuilder resultado = new StringBuilder();

        for (int i = c1.length() - 1; i >= 0; i--) {
            resultado.append(c1.charAt(i));
        }
        return resultado.toString();
	}
}
