//Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
//Suponiendo que todos los meses son de 30 días.
package EjercicioCiclos09;

import javax.swing.JOptionPane;

public class EjercicioCiclos09 {
    
    public static void main(String[] args) {
         
        // Pedir datos con JOptionPane
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año:"));
        
        // Validar la fecha (todos los meses tienen 30 días)
        boolean fechaValida = true;
        
        if (dia < 1 || dia > 30) {
            fechaValida = false;
        }
        if (mes < 1 || mes > 12) {
            fechaValida = false;
        }
        if (anio < 1) { // suponemos que no hay año 0 ni negativos
            fechaValida = false;
        }
        
        // Mostrar resultado en consola
        if (fechaValida) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es válida.");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
        
        // Mostrar resultado en JOptionPane
        String mensaje = fechaValida 
                ? "La fecha " + dia + "/" + mes + "/" + anio + " es válida."
                : "La fecha ingresada no es válida.";
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
} 
    

