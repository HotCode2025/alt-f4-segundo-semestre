package EjercicioCiclos03.Ciclos03;

import java.util.Scanner;

public class Ciclos03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce números para saber si es par o impar(0 para salir):");
        do {
            numero = sc.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println(numero + " es par");
                } else {
                    System.out.println(numero + " es impar");
                }
            }
        } while (numero != 0);
        sc.close();
    }
}
