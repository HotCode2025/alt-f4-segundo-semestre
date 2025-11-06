package ProyectoFarmacia.model;

/**
 * Clase abstracta que representa un producto genérico en la farmacia.
 * Esta es la clase base para todos los productos del sistema.
 */
public abstract class Producto {
    private final int id;
    private final String nombre;
    private final double precio;

    /**
     * Constructor de Producto.
     * 
     * @param id Identificador único del producto
     * @param nombre Nombre del producto
     * @param precio Precio del producto (debe ser mayor a 0)
     * @throws IllegalArgumentException si el precio es negativo o cero
     */
    public Producto(int id, String nombre, double precio) {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID del producto debe ser mayor a 0");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio del producto debe ser mayor a 0");
        }
        
        this.id = id;
        this.nombre = nombre.trim();
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la categoría del producto.
     * @return Categoría del producto
     */
    public abstract String getCategoria();

    /**
     * Obtiene una representación del producto sin el ID, solo nombre y precio.
     * Útil para mostrar el inventario al cliente.
     * 
     * @return String con nombre y precio del producto
     */
    public String toStringSinId() {
        return String.format("Nombre: %s, Precio: $%.2f", nombre, precio);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nombre: %s, Precio: $%.2f", id, nombre, precio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Producto producto = (Producto) obj;
        return id == producto.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

