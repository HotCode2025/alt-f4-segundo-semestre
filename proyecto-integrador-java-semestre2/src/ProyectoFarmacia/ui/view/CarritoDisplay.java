package ProyectoFarmacia.ui.view;

import ProyectoFarmacia.model.Pedido;
import ProyectoFarmacia.model.Producto;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Clase responsable de mostrar y gestionar la visualización del carrito de compras.
 * Separa la lógica de presentación del carrito de la UI principal.
 */
public class CarritoDisplay {
    private final Scanner scanner;

    /**
     * Constructor de CarritoDisplay.
     * 
     * @param scanner Scanner para entrada de datos
     */
    public CarritoDisplay(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Muestra el carrito con todos los productos agregados al pedido.
     * 
     * @param pedido Pedido actual a mostrar
     */
    public void mostrarCarrito(Pedido pedido) {
        System.out.println("\n═══════════════════════════════════════════════");
        System.out.println("           CARRITO DE COMPRAS");
        System.out.println("═══════════════════════════════════════════════");
        
        if (pedido.estaVacio()) {
            mostrarCarritoVacio();
            return;
        }

        mostrarDetalleCarrito(pedido);
    }

    /**
     * Muestra el menú de opciones después de ver el carrito.
     * 
     * @return 1 si se selecciona "Remover item", 2 si se selecciona "Seguir comprando", 3 si se selecciona "Finalizar pedido"
     */
    public int mostrarMenuDespuesCarrito() {
        System.out.println("\n--- ¿Qué desea hacer? ---");
        System.out.println("1. Remover item del carrito");
        System.out.println("2. Seguir comprando");
        System.out.println("3. Finalizar pedido");
        System.out.print("Seleccione una opción: ");

        int opcion;
        do {
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
                
                if (opcion >= 1 && opcion <= 3) {
                    return opcion;
                } else {
                    System.out.println("Opción no válida. Por favor seleccione 1, 2 o 3.");
                    System.out.print("Seleccione una opción: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor ingrese un número.");
                scanner.nextLine();
                System.out.print("Seleccione una opción: ");
                opcion = 0;
            }
        } while (true);
    }

    /**
     * Solicita al usuario el número del producto a remover y lo remueve del carrito.
     * 
     * @param pedido Pedido del cual remover el producto
     * @return true si se removió un producto, false si se canceló o el índice es inválido
     */
    public boolean removerItemDelCarrito(Pedido pedido) {
        if (pedido.estaVacio()) {
            System.out.println("\nEl carrito está vacío.");
            return false;
        }

        System.out.print("\nIngrese el número del producto a remover (o 0 para cancelar): ");
        
        try {
            int numero = scanner.nextInt();
            scanner.nextLine();

            if (numero == 0) {
                return false;
            }

            if (pedido.removerProducto(numero)) {
                System.out.println("\nProducto removido del carrito exitosamente.");
                return true;
            } else {
                System.out.println("\nNúmero inválido. El producto no existe en el carrito.");
                return false;
            }
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida, por favor ingrese un número.");
            scanner.nextLine();
            return false;
        }
    }

    /**
     * Muestra el mensaje cuando el carrito está vacío.
     */
    private void mostrarCarritoVacio() {
        System.out.println("\n   El carrito está vacío.");
        System.out.println("\n   Volviendo al menú de compra...");
        System.out.println("\n═══════════════════════════════════════════════");
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();
    }

    /**
     * Muestra el detalle completo del carrito con productos.
     * 
     * @param pedido Pedido con productos
     */
    private void mostrarDetalleCarrito(Pedido pedido) {
        List<Producto> productos = pedido.getProductosPedidos();
        
        System.out.println("\nCliente: " + pedido.getTurnoAsociado().getNombreCliente());
        System.out.println("\nProductos en el carrito:");
        System.out.println("─────────────────────────────────────────────────────");
        
        mostrarListaProductos(productos);
        
        System.out.println("─────────────────────────────────────────────────────");
        mostrarResumenTotal(pedido);
        System.out.println("═══════════════════════════════════════════════");
    }

    /**
     * Muestra la lista numerada de productos.
     * 
     * @param productos Lista de productos a mostrar
     */
    private void mostrarListaProductos(List<Producto> productos) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            System.out.println(String.format("  %d. %-30s $%8.2f", 
                (i + 1), producto.getNombre(), producto.getPrecio()));
        }
    }

    /**
     * Muestra el resumen con totales del pedido.
     * 
     * @param pedido Pedido del cual mostrar el resumen
     */
    private void mostrarResumenTotal(Pedido pedido) {
        System.out.println(String.format("  Total de productos: %d", pedido.getCantidadProductos()));
        System.out.println(String.format("  Total a pagar:     $%.2f", pedido.calcularTotal()));
    }
}

