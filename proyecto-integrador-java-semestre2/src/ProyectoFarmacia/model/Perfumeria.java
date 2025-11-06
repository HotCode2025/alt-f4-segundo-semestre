package ProyectoFarmacia.model;

import ProyectoFarmacia.enums.CategoriaProducto;

/**
 * Clase que representa un producto de perfumería en la farmacia.
 * Extiende de Producto.
 */
public class Perfumeria extends Producto {

    /**
     * Constructor de Perfumeria.
     * 
     * @param id Identificador único del producto
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     */
    public Perfumeria(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public String getCategoria() {
        return CategoriaProducto.PERFUMERIA.getValor();
    }
}

