import java.io.IOException;
import java.util.Scanner;


/**
 * Clase que calcula el factorial de un numero
 * @author jacinto
 *
 */

public class Factorial {

/***
 * 	
 * @param valor
 */

    public static void imprime (Object valor) {
        System.out.println(valor);
    }
    
    /***
     *  
     * @return numero 
     */
    
    public static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            imprime("Indique un número entero positivo: ");
            numero = teclado.nextInt();
        } while (numero < 0);
        return numero;
    }
/***
 * 
 * @param numero
 * @return
 */

    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            int resultado = numero;
            for (int valor = numero-1; valor >= 1; valor--) {
                resultado *= valor;
            }        
            return resultado;
        }
    }
  
    /***
     * 
     * @param args
     * @throws IOException
     */
    
    public static void main(String[] args) throws IOException {
        imprime("CÁLCULO DEL FACTORIAL DE UN NÚMERO");
        int numero = leerNumero();        
        int resultado = factorial(numero);
        imprime("El factorial de " + numero + " es " + resultado);
    }    
}
