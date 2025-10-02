package ciclos10;

import java.util.Scanner;              // Para entrada por consola
import javax.swing.JOptionPane;        // Para entrada gráfica

public class Ciclos10 {
    public static void main(String[] args) {
        
        // ----------- OPCIÓN 1: Con Scanner -----------
        Scanner entrada = new Scanner(System.in);
        int sumaScanner = 0;
        
        System.out.println("=== Usando Scanner ===");
        for(int i = 1; i <= 10; i++){
            System.out.print("Ingrese el número " + i + ": ");
            int numero = entrada.nextInt();
            sumaScanner += numero;
        }
        System.out.println("La suma total (Scanner) es: " + sumaScanner);
        
        
        // ----------- OPCIÓN 2: Con JOptionPane -----------
        int sumaJOption = 0;
        
        for(int i = 1; i <= 10; i++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese el número " + i + ":"));
            sumaJOption += numero;
        }
        
        JOptionPane.showMessageDialog(null, 
            "La suma total (JOptionPane) es: " + sumaJOption);
    }
}
