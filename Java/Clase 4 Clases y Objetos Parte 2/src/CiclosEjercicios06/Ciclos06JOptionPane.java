package CiclosEjercicios06;
import javax.swing.JOptionPane;

public class Ciclos06JOptionPane {
    public static void main(String[] args) {
        int numero, suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para terminar):"));
            suma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma de todos los números introducidos es: " + suma);
    }
}

