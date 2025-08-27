package EjercicioCiclos04.Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;
        System.out.println("Introduce números (uno negativo para salir):");
        do {
            numero = sc.nextInt();
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);
        sc.close();
        System.out.println("Cantidad de números introducidos: " + contador);
    }
}
