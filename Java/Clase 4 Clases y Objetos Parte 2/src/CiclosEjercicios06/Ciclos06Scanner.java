package CiclosEjercicios06;
import java.util.Scanner;

public class Ciclos06Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;

        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = entrada.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de todos los números introducidos es: " + suma);
    }
}

