package CiclosEjercicios07;
import javax.swing.JOptionPane;

public class Ciclos07JOptionePane {
    public static void main(String[] args) {
        int numero, suma = 0, contador = 0;

        while (true) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (negativo para terminar):"));
            if (numero < 0) {
                break;
            }
            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            JOptionPane.showMessageDialog(null, "La media de los números es: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "No se introdujeron números válidos.");
        }
    }
}
