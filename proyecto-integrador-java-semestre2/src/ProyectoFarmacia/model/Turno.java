package ProyectoFarmacia.model;

import ProyectoFarmacia.enums.EstadoTurno;

/**
 * Clase que representa un turno en el sistema de atención de la farmacia.
 */
public class Turno {
    private final int idTurno;
    private final String nombreCliente;
    private EstadoTurno estado;

    /**
     * Constructor de Turno.
     * 
     * @param idTurno Identificador único del turno
     * @param nombreCliente Nombre del cliente que solicita el turno
     * @throws IllegalArgumentException si el nombre del cliente está vacío
     */
    public Turno(int idTurno, String nombreCliente) {
        if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }
        this.idTurno = idTurno;
        this.nombreCliente = nombreCliente.trim();
        this.estado = EstadoTurno.PENDIENTE;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public EstadoTurno getEstado() {
        return estado;
    }

    public void setEstado(EstadoTurno estado) {
        if (estado == null) {
            throw new IllegalArgumentException("El estado no puede ser nulo");
        }
        this.estado = estado;
    }

    @Override
    public String toString() {
        return String.format("T%d - Cliente: %s [%s]", idTurno, nombreCliente, estado.getValor());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Turno turno = (Turno) obj;
        return idTurno == turno.idTurno;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(idTurno);
    }
}

