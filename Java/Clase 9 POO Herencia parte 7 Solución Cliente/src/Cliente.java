
import java.util.Date;

public class Cliente extends Persona {

    // Atributos específicos de Cliente
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;

    // Constructor con herencia (usa super para inicializar los atributos de Persona)
    public Cliente(String nombre, char genero, int edad, String direccion,
                   int idCliente, Date fechaRegistro, boolean vip) {
        super(nombre, genero, edad, direccion); // Llama al constructor de Persona
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    // Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    // Método opcional para mostrar información completa del cliente
    public void mostrarInfo() {
        System.out.println("----- Cliente -----");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Género: " + getGenero());
        System.out.println("Edad: " + getEdad());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("Fecha de Registro: " + fechaRegistro);
        System.out.println("¿VIP?: " + (vip ? "Sí" : "No"));
    }
}
