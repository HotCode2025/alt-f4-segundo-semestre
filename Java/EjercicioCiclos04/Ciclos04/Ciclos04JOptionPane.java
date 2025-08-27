package EjercicioCiclos04.Ciclos04;

import javax.swing.JOptionPane;

public class Ciclos04JOptionPane {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        do {
            String input = JOptionPane.showInputDialog(null, "Introduce un número (negativo para salir):");
            if (input == null) break;
            try {
                numero = Integer.parseInt(input);
                if (numero >= 0) {
                    contador++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
                numero = 0; // Para continuar el ciclo
            }
        } while (numero >= 0);
        JOptionPane.showMessageDialog(null, "Cantidad de números introducidos: " + contador);
    }
}
