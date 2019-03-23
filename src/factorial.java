import java.util.Scanner;

/**
 * Clase factorial
 * Esta clase calcula el factorial de un numero solicitado al usuario
 */

public class factorial {
    public static int calculo (int n) {
        if (n < 0) {
            System.out.println("No puedo Calcular el factorial de un número negativo.");
        }
        int fac = 1;
        for (int i = 2; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main (String [] args) {
        Scanner tec = new Scanner(System.in);
        int numero, facto;
        System.out.println("Introduce el número al que calcular el factorial: ");
        numero = tec.nextInt();
        facto = factorial.calculo(numero);
        System.out.println("El factorial de " + numero + " es : " + facto);
    }
}