//Ejercicio 08: Pedir un número N y mostrar todos los números del 1 al N.
package EjercicioCiclos08;

import javax.swing.JOptionPane;

public class EjercicioCiclos08 {
    
    public static void main(String[] args) {
         // Pedimos el número una sola vez con JOptionPane
        String nStr = JOptionPane.showInputDialog("Ingresa un número N:");
        int n = Integer.parseInt(nStr);

        // Mostramos en consola
        System.out.println("Números del 1 al " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // Mostramos también en ventana
        StringBuilder salida = new StringBuilder("Números del 1 al " + n + ":\n");
        for (int i = 1; i <= n; i++) {
            salida.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, salida.toString());
    }
}
