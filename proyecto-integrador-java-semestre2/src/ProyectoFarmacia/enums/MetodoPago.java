package ProyectoFarmacia.enums;

/**
 * Enum que representa los métodos de pago disponibles en el sistema.
 */
public enum MetodoPago {
    EFECTIVO("Efectivo"),
    TARJETA("Tarjeta");
    
    private final String descripcion;
    
    MetodoPago(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public String toString() {
        return descripcion;
    }
    
    /**
     * Intenta convertir un string a MetodoPago.
     * @param texto Texto a convertir
     * @return MetodoPago correspondiente o null si no es válido
     */
    public static MetodoPago fromString(String texto) {
        if (texto == null) {
            return null;
        }
        String textoLimpio = texto.trim().toUpperCase();
        for (MetodoPago metodo : MetodoPago.values()) {
            if (metodo.name().equals(textoLimpio) || 
                metodo.descripcion.toUpperCase().equals(textoLimpio)) {
                return metodo;
            }
        }
        return null;
    }
}

