package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Introduzca una frase: ");
        String c1 = sc.nextLine();

        comienzo(c1);
        fin(c1);

        sc.close();
    }
    public static void comienzo(String c1) {
        if (c1.startsWith("Javalin, javalon")) {
            String resultado = c1.substring("Javalin, javalon".length()).trim();
            System.out.println("La frase sin el comienzo: " + resultado);
        } else {
            System.out.println("No comienza con Javalin, javalon");
        }
    }
    public static void fin(String c1) {
        if (c1.endsWith("javalen, len, len")) {
            String resultado = c1.substring(0, c1.length() - "javalen, len, len".length()).trim();
            System.out.println("La frase sin el final: " + resultado);
        } else {
            System.out.println("No termina con javalen, len, len");
        }
    }
}