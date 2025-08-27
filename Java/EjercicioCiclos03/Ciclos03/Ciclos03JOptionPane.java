package EjercicioCiclos03.Ciclos03;

import javax.swing.JOptionPane;

public class Ciclos03JOptionPane {
    public static void main(String[] args) {
        int numero;
        do {
            String input = JOptionPane.showInputDialog(null, "Introduce un número para saber si es par o impar (0 para salir):");
            if (input == null) break; 
            try {
                numero = Integer.parseInt(input);
                if (numero != 0) {
                    String tipo = (numero % 2 == 0) ? "par" : "impar";
                    JOptionPane.showMessageDialog(null, numero + " es " + tipo);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
                numero = -1;
            }
        } while (numero != 0);
    }
}
