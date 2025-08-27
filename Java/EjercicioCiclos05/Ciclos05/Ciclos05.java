package EjercicioCiclos05.Ciclos05;

import java.util.Scanner;
import java.util.Random;

public class Ciclos05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(101); // 0-100
        Scanner sc = new Scanner(System.in);
        int intento;
        int contador = 0;
        System.out.println("Adivina el número entre 0 y 100");
        do {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();
            contador++;
            if (intento < numeroSecreto) {
                System.out.println("Es mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("Es menor");
            } else {
                System.out.println("¡Correcto! Número de intentos: " + contador);
            }
        } while (intento != numeroSecreto);
        sc.close();
    }
}
