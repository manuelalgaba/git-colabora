package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);

        System.out.println("Introduzca una frase (sin tildes): ");
        String c1 = sc.nextLine();
        
        String frase1 = c1.replaceAll("[ ]", "");
        
        boolean sonIguales = frase1.equalsIgnoreCase(invertirCadena(frase1));
        
        System.out.println("¿Es palindroma?: " + sonIguales);
        
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