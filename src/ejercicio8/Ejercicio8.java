package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		var sc = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String c1 = sc.nextLine();
        System.out.println("Introduzca la palabra que quiere buscar: ");
        String c2 = sc.nextLine();
        
        System.out.println("Se repite la palabra " + c2 + " " + contarPalabraEnFrase(c1, c2) + " veces");
        
        sc.close();
	}
	public static int contarPalabraEnFrase(String c1, String c2) {
		int contador = 0;
        int indice = c1.indexOf(c2);

        while (indice != -1) {
            contador++;
            indice = c1.indexOf(c2, indice + 1);
        }
        return contador;
    }
}