package ProyectoFarmacia.enums;

/**
 * Enum que representa los posibles estados de un turno en el sistema.
 */
public enum EstadoTurno {
    PENDIENTE("PENDIENTE"),
    EN_ATENCION("EN_ATENCION"),
    FINALIZADO("FINALIZADO");
    
    private final String valor;
    
    EstadoTurno(String valor) {
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

