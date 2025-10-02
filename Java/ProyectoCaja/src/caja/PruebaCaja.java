package caja;

public class PruebaCaja {
    public static void main(String args[]) {  // Método main
        
        // Variables locales (valores ingresados en código duro)
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;
        
        // Instanciamos el objeto con el constructor vacío
        Caja caja1 = new Caja();
        
        // Le asignamos valores a los atributos del objeto
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        
        // Llamamos al método calcularVolumen
        int resultado = caja1.calcularVolumen();
        
        // Imprimimos el primer resultado
        System.out.println("Resultado volumen de caja 1: " + resultado);
        
        
        // Instanciamos un segundo objeto con el constructor con parámetros
        Caja caja2 = new Caja(2, 4, 6);
        
        // Llamamos directamente al método para calcular el volumen
        System.out.println("Resultado volumen de caja 2: " + caja2.calcularVolumen());
    }
}
