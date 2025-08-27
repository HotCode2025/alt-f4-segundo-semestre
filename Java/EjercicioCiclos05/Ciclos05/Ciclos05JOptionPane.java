package EjercicioCiclos05.Ciclos05;

import javax.swing.JOptionPane;
import java.util.Random;

public class Ciclos05JOptionPane {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(101); // 0-100
        int intento = -1;
        int contador = 0;
        String input;
        do {
            input = JOptionPane.showInputDialog(null, "Adivina el número entre 0 y 100:");
            if (input == null) break;
            try {
                intento = Integer.parseInt(input);
                contador++;
                if (intento < numeroSecreto) {
                    JOptionPane.showMessageDialog(null, "Es mayor");
                } else if (intento > numeroSecreto) {
                    JOptionPane.showMessageDialog(null, "Es menor");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Correcto! Número de intentos: " + contador);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
                intento = -1; // Para continuar el ciclo
            }
        } while (input != null && intento != numeroSecreto);
    }
}
