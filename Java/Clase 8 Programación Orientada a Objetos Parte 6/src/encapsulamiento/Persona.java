package encapsulamiento;

public class Persona {
    // Atributos privados (encapsulados)
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    // Constructor para inicializar los atributos
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    // Métodos Getters (para obtener valores)
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    // Métodos Setters (para modificar valores)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    // Método toString para mostrar los datos fácilmente
    @Override
    public String toString() {
        return "Persona [Nombre = " + nombre + ", Sueldo = " + sueldo + ", Eliminado = " + eliminado + "]";
    }
}
