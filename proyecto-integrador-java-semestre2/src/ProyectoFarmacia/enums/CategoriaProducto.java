package ProyectoFarmacia.enums;

/**
 * Enum que representa las categorías de productos disponibles en la farmacia.
 */
public enum CategoriaProducto {
    MEDICAMENTO("MEDICAMENTO"),
    PERFUMERIA("PERFUMERIA");
    
    private final String valor;
    
    CategoriaProducto(String valor) {
        this.valor = valor;
    }
    
    public String getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        return valor;
    }
}

