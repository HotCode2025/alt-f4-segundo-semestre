package ProyectoFarmacia.model;

import ProyectoFarmacia.enums.CategoriaProducto;

/**
 * Clase que representa un medicamento en la farmacia.
 * Extiende de Producto.
 */
public class Medicamento extends Producto {

    /**
     * Constructor de Medicamento.
     * 
     * @param id Identificador único del medicamento
     * @param nombre Nombre del medicamento
     * @param precio Precio del medicamento
     */
    public Medicamento(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public String getCategoria() {
        return CategoriaProducto.MEDICAMENTO.getValor();
    }
}

