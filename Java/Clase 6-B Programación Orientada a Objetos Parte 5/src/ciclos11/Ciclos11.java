package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {
    public static void main(String[] args) {
        
        long producto = 1;  // Usamos long porque el resultado puede ser muy grande
        StringBuilder serie = new StringBuilder("Los 10 primeros números impares son: ");
        
        int contador = 0;
        int numero = 1;
        
        // Bucle para obtener los 10 primeros impares
        while (contador < 10) {
            producto *= numero;
            serie.append(numero).append(" ");
            
            numero += 2; // saltamos al siguiente impar
            contador++;
        }
        
        // Mostrar la serie de impares y el producto final
        JOptionPane.showMessageDialog(null, 
            serie.toString() + "\n\nEl producto de los 10 primeros impares es: " + producto);
    }
}
