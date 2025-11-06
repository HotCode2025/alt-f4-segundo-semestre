package ProyectoFarmacia.service;

import ProyectoFarmacia.enums.CategoriaProducto;
import ProyectoFarmacia.enums.EstadoTurno;
import ProyectoFarmacia.enums.MetodoPago;
import ProyectoFarmacia.model.Medicamento;
import ProyectoFarmacia.model.Pedido;
import ProyectoFarmacia.model.Perfumeria;
import ProyectoFarmacia.model.Producto;
import ProyectoFarmacia.model.Turno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * Servicio principal que gestiona la lógica de negocio de la farmacia.
 * Maneja turnos, inventario y procesamiento de pagos.
 */
public class FarmaciaServicio {
    private final Queue<Turno> colaTurnos;
    private final List<Producto> inventario;
    private int contadorTurnos;

    /**
     * Constructor de FarmaciaServicio.
     * Inicializa las estructuras de datos y carga el inventario inicial.
     */
    public FarmaciaServicio() {
        this.colaTurnos = new LinkedList<>();
        this.inventario = new ArrayList<>();
        this.contadorTurnos = 0;
        inicializarInventario();
    }

    /**
     * Inicializa el inventario con productos de ejemplo.
     */
    private void inicializarInventario() {
        // Medicamentos
        inventario.add(new Medicamento(100, "Aspirina", 8.55));
        inventario.add(new Medicamento(101, "Antibiotico", 9.50));
        inventario.add(new Medicamento(102, "Analgesico", 10.20));
        inventario.add(new Medicamento(103, "Calmantes", 8.99));
        inventario.add(new Medicamento(104, "Antialergicos", 15.40));

        // Perfumeria
        inventario.add(new Perfumeria(200, "Colonia", 120.00));
        inventario.add(new Perfumeria(201, "Shampoo", 95.00));
        inventario.add(new Perfumeria(203, "Crema", 15.00));
        inventario.add(new Perfumeria(204, "Desodorante", 12.00));
        inventario.add(new Perfumeria(205, "Talco", 7.00));
        inventario.add(new Perfumeria(206, "Acondicionador", 96.00));
        inventario.add(new Perfumeria(207, "Jabon Tocador", 6.55));
    }

    /**
     * Genera un nuevo turno para un cliente.
     * 
     * @param nombreCliente Nombre del cliente
     * @return Turno generado
     * @throws IllegalArgumentException si el nombre del cliente está vacío
     */
    public Turno sacarTurno(String nombreCliente) {
        if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }

        contadorTurnos++;
        Turno nuevoTurno = new Turno(contadorTurnos, nombreCliente);
        colaTurnos.offer(nuevoTurno);
        return nuevoTurno;
    }

    /**
     * Obtiene el siguiente turno en la cola y lo marca como en atención.
     * 
     * @return Siguiente turno o null si no hay turnos pendientes
     */
    public Turno llamarSiguiente() {
        Turno turno = colaTurnos.poll();
        if (turno != null) {
            turno.setEstado(EstadoTurno.EN_ATENCION);
        }
        return turno;
    }

    /**
     * Obtiene todos los productos del inventario filtrados por categoría.
     * 
     * @param categoria Categoría del producto (MEDICAMENTO o PERFUMERIA)
     * @return Lista de productos de la categoría especificada
     */
    public List<Producto> obtenerInventarioPorCategoria(CategoriaProducto categoria) {
        if (categoria == null) {
            return Collections.emptyList();
        }

        return inventario.stream()
                .filter(producto -> {
                    if (categoria == CategoriaProducto.MEDICAMENTO) {
                        return producto instanceof Medicamento;
                    } else if (categoria == CategoriaProducto.PERFUMERIA) {
                        return producto instanceof Perfumeria;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    /**
     * Normaliza un string eliminando acentos y convirtiéndolo a minúsculas.
     * 
     * @param texto Texto a normalizar
     * @return Texto sin acentos y en minúsculas
     */
    private String normalizarTexto(String texto) {
        if (texto == null) {
            return null;
        }
        
        return texto.trim()
                .toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace("ñ", "n");
    }

    /**
     * Busca un producto en el inventario por su nombre dentro de una categoría específica.
     * La búsqueda es case-insensitive y sin acentos (acepta búsquedas con o sin acentos).
     * 
     * @param nombreProducto Nombre del producto a buscar
     * @param categoria Categoría en la que buscar
     * @return Producto encontrado o null si no existe
     */
    public Producto buscarProductoPorNombre(String nombreProducto, CategoriaProducto categoria) {
        if (nombreProducto == null || nombreProducto.trim().isEmpty()) {
            return null;
        }
        if (categoria == null) {
            return null;
        }

        String nombreBuscado = normalizarTexto(nombreProducto);
        
        return obtenerInventarioPorCategoria(categoria).stream()
                .filter(producto -> normalizarTexto(producto.getNombre()).equals(nombreBuscado))
                .findFirst()
                .orElse(null);
    }

    /**
     * Procesa el pago de un pedido.
     * 
     * @param pedido Pedido a procesar
     * @param metodoPago Método de pago utilizado
     * @throws IllegalArgumentException si el pedido o método de pago son inválidos
     */
    public void procesarPago(Pedido pedido, MetodoPago metodoPago) {
        if (pedido == null) {
            throw new IllegalArgumentException("El pedido no puede ser nulo");
        }
        if (metodoPago == null) {
            throw new IllegalArgumentException("El método de pago no puede ser nulo");
        }
        if (pedido.estaVacio()) {
            throw new IllegalStateException("No se puede procesar el pago de un pedido vacío");
        }

        pedido.getTurnoAsociado().setEstado(EstadoTurno.FINALIZADO);
        // El mensaje de confirmación ahora se maneja en la UI
    }

    /**
     * Obtiene el número de turnos pendientes en la cola.
     * 
     * @return Cantidad de turnos pendientes
     */
    public int getCantidadTurnosPendientes() {
        return colaTurnos.size();
    }
}

