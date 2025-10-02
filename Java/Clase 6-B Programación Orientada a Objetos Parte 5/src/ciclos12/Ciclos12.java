package ciclos12;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos12 {
    public static void main(String[] args) {
        
        // ================= OPCIÓN 1: Usando Scanner =================
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numeroScanner = entrada.nextInt();
        
        long factorialScanner = 1;
        for(int i = 1; i <= numeroScanner; i++){
            factorialScanner *= i;
        }
        
        System.out.println("El factorial de " + numeroScanner + " es: " + factorialScanner);
        
        
        // ================= OPCIÓN 2: Usando JOptionPane =================
        int numeroJOption = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un número para calcular su factorial: ")
        );
        
        long factorialJOption = 1;
        for(int i = 1; i <= numeroJOption; i++){
            factorialJOption *= i;
        }
        
        JOptionPane.showMessageDialog(null, 
                "El factorial de " + numeroJOption + " es: " + factorialJOption);
    }
}
