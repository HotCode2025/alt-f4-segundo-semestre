package EjercicioCiclos01.Ciclos01;

import javax.swing.JOptionPane;

public class Ciclos01JOptionPane {

    public static void main(String[] args) {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }

        System.out.println("El programa ha finalizado por numero negativo.");
    }
}
