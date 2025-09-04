
package CiclosEjercicios07;
import java.util.Scanner;

public class Ciclos07Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0, contador = 0;

        System.out.println("Introduce números (uno negativo para terminar):");

        while (true) {
            numero = entrada.nextInt();
            if (numero < 0) {
                break; // salir si es negativo
            }
            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No se introdujeron números válidos.");
        }
    }
}
