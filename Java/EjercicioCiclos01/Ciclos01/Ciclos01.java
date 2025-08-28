package EjercicioCiclos01.Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, cuadrado;
        System.out.print("Ingrese un numero: ");
        numero = Integer.parseInt(scanner.nextLine());
        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es " + cuadrado);
            System.out.print("Ingrese otro numero: ");
            numero = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("El programa ha finalizado por numero negativo.");   
    }
}