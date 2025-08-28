package EjercicioCiclos02.Ciclos02;

import java.util.Scanner;

public class Ciclos02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        var numero = Integer.parseInt(scanner.nextLine());
        while (numero != 0) {
            if(numero > 0) {
                System.out.println("El numero " + numero + " es positivo.");
            } else {
                System.out.println("El numero " + numero + " es negativo.");
            }
            System.out.print("Ingrese otro numero: ");
            numero = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("El numero " + numero + " finaliza el programa");
    }
}
