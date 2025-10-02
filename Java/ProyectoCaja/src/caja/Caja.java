package caja; // Package

public class Caja { // Clase publica caja
    
    // Atributos (características)
    int ancho;
    int alto;
    int profundo;
    
    // Métodos y constructores (acciones)
    
    // Constructor 1 = vacío
    public Caja() {
    }
    
    // Constructor 2 = con parámetros
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    // Método para calcular volumen
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}
