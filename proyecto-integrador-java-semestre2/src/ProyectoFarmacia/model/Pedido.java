package ProyectoFarmacia.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que representa un pedido realizado por un cliente en la farmacia.
 * Un pedido está asociado a un turno y contiene una lista de productos.
 */
public class Pedido {
    private final Turno turnoAsociado;
    private final List<Producto> productosPedidos;

    /**
     * Constructor de Pedido.
     * 
     * @param turno Turno asociado al pedido
     * @throws IllegalArgumentException si el turno es nulo
     */
    public Pedido(Turno turno) {
        if (turno == null) {
            throw new IllegalArgumentException("El turno no puede ser nulo");
        }
        this.turnoAsociado = turno;
        this.productosPedidos = new ArrayList<>();
    }

    /**
     * Agrega un producto al pedido.
     * 
     * @param producto Producto a agregar
     * @throws IllegalArgumentException si el producto es nulo
     */
    public void agregarProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        productosPedidos.add(producto);
    }

    /**
     * Remueve un producto del pedido por su índice.
     * 
     * @param indice Índice del producto a remover (basado en 1, no en 0)
     * @return true si el producto fue removido exitosamente, false si el índice es inválido
     */
    public boolean removerProducto(int indice) {
        // Convertir índice basado en 1 a índice basado en 0
        int indiceReal = indice - 1;
        
        if (indiceReal < 0 || indiceReal >= productosPedidos.size()) {
            return false;
        }
        
        productosPedidos.remove(indiceReal);
        return true;
    }

    /**
     * Calcula el total del pedido sumando los precios de todos los productos.
     * 
     * @return Total del pedido
     */
    public double calcularTotal() {
        return productosPedidos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    public Turno getTurnoAsociado() {
        return turnoAsociado;
    }

    /**
     * Obtiene una lista inmutable de los productos del pedido.
     * 
     * @return Lista inmutable de productos
     */
    public List<Producto> getProductosPedidos() {
        return Collections.unmodifiableList(productosPedidos);
    }

    /**
     * Verifica si el pedido está vacío.
     * 
     * @return true si no hay productos, false en caso contrario
     */
    public boolean estaVacio() {
        return productosPedidos.isEmpty();
    }

    /**
     * Obtiene la cantidad de productos en el pedido.
     * 
     * @return Cantidad de productos
     */
    public int getCantidadProductos() {
        return productosPedidos.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- PEDIDO PARA ").append(turnoAsociado.getNombreCliente()).append(" ---\n");
        sb.append("Total productos: ").append(getCantidadProductos()).append("\n");
        sb.append("Total a pagar: $").append(String.format("%.2f", calcularTotal()));
        return sb.toString();
    }
}

