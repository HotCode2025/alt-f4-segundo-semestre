package ProyectoFarmacia.ui;

import ProyectoFarmacia.enums.CategoriaProducto;
import ProyectoFarmacia.enums.EstadoTurno;
import ProyectoFarmacia.enums.MetodoPago;
import ProyectoFarmacia.model.Pedido;
import ProyectoFarmacia.model.Producto;
import ProyectoFarmacia.model.Turno;
import ProyectoFarmacia.service.FarmaciaServicio;
import ProyectoFarmacia.ui.view.CarritoDisplay;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal que maneja la interfaz de usuario del sistema de farmacia.
 * Gestiona la interacción con el usuario mediante consola.
 */
public class FarmaciaUI {
    private static final String MENU_PRINCIPAL = 
        "\n===== SISTEMA DE ATENCION FARMACIA ALT+F4 =====\n" +
        "1. Sacar turno (cliente) - Para ser atendido debe sacar turno\n" +
        "2. Iniciar atención - Requiere sacar turno primero\n" +
        "3. Salir\n" +
        "Seleccione una opción: ";

    private static final String MENU_DESPUES_TURNO = 
        "\n--- ¿Qué desea hacer? ---\n" +
        "1. Iniciar atención\n" +
        "2. Volver al menú principal\n" +
        "Seleccione una opción: ";

    private static final String MENU_PEDIDO = 
        "\n--- TOMA DE PEDIDO (%s) ---\n" +
        "1. Ver Medicamentos\n" +
        "2. Ver Perfumeria\n" +
        "3. Ver carrito (Productos agregados)\n" +
        "4. Finalizar y Pagar (Total: $%.2f)\n" +
        "Seleccione una opción: ";

    // MENU_DESPUES_AGREGAR se genera dinámicamente según la categoría

    private final Scanner scanner;
    private final FarmaciaServicio servicio;
    private final CarritoDisplay carritoDisplay;

    /**
     * Constructor de FarmaciaUI.
     * 
     * @param scanner Scanner para entrada de datos
     * @param servicio Servicio de la farmacia
     */
    public FarmaciaUI(Scanner scanner, FarmaciaServicio servicio) {
        this.scanner = scanner;
        this.servicio = servicio;
        this.carritoDisplay = new CarritoDisplay(scanner);
    }

    /**
     * Método principal que inicia la aplicación.
     * 
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FarmaciaServicio servicio = new FarmaciaServicio();
        FarmaciaUI ui = new FarmaciaUI(scanner, servicio);
        
        ui.ejecutar();
        
        scanner.close();
    }

    /**
     * Ejecuta el ciclo principal de la aplicación.
     */
    public void ejecutar() {
        int opcionPrincipal;

        do {
            System.out.print(MENU_PRINCIPAL);
            
            try {
                opcionPrincipal = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
            } catch (InputMismatchException e) {
                System.out.println("❌ Entrada inválida, por favor ingrese un número.");
                scanner.nextLine();
                opcionPrincipal = 0;
                continue;
            }

            switch (opcionPrincipal) {
                case 1:
                    procesarSacarTurno();
                    break;
                case 2:
                    procesarIniciarAtencion();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("❌ Opción no válida, intente de nuevo.");
            }

        } while (opcionPrincipal != 3);
    }

    /**
     * Procesa la solicitud de un nuevo turno.
     */
    private void procesarSacarTurno() {
        System.out.print("Ingrese su nombre para el turno: ");
        String nombre = scanner.nextLine().trim();

        if (nombre.isEmpty()) {
            System.out.println("❌ El nombre no puede estar vacío.");
            System.out.print("Presione Enter para volver al menú principal...");
            scanner.nextLine();
            return;
        }

        try {
            Turno turno = servicio.sacarTurno(nombre);
            mostrarConfirmacionTurno(turno);
            mostrarMenuDespuesTurno();
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
            System.out.print("Presione Enter para volver al menú principal...");
            scanner.nextLine();
        }
    }

    /**
     * Muestra un mensaje de confirmación y bienvenida al generar un turno.
     * 
     * @param turno Turno generado
     */
    private void mostrarConfirmacionTurno(Turno turno) {
        System.out.println("\n═══════════════════════════════════════════════");
        System.out.println("           ¡BIENVENIDO/A A LA FARMACIA ALT+F4!");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println(String.format("\n¡Hola %s!", turno.getNombreCliente()));
        System.out.println(String.format("Su turno es: T%d y ya ha sido registrado en la cola de atención.", turno.getIdTurno()));
        System.out.println("\n¡Gracias por elegirnos!");
        System.out.println("═══════════════════════════════════════════════");
    }

    /**
     * Muestra el menú después de sacar un turno, permitiendo iniciar atención o volver al menú principal.
     */
    private void mostrarMenuDespuesTurno() {
        int opcion;
        
        do {
            System.out.print(MENU_DESPUES_TURNO);
            
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("❌ Entrada inválida, por favor ingrese un número.");
                scanner.nextLine();
                opcion = 0;
                continue;
            }

            switch (opcion) {
                case 1:
                    procesarIniciarAtencion();
                    return; // Salir del menú después de atender
                case 2:
                    // Volver al menú principal
                    return;
                default:
                    System.out.println("❌ Opción no válida, intente de nuevo.");
            }
        } while (true);
    }

    /**
     * Muestra un mensaje formal de inicio de atención al cliente.
     * 
     * @param turno Turno que se está atendiendo
     * @param turnosPendientes Cantidad total de turnos que había pendientes
     */
    private void mostrarInicioAtencion(Turno turno, int turnosPendientes) {
        System.out.println("\n═══════════════════════════════════════════════");
        System.out.println("        INICIANDO ATENCION AL CLIENTE");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println(String.format("\nTurno N°: T%d", turno.getIdTurno()));
        System.out.println(String.format("Cliente: %s", turno.getNombreCliente()));
        System.out.println(String.format("Estado: %s", turno.getEstado().getValor()));
        if (turnosPendientes > 1) {
            System.out.println(String.format("\nTurnos restantes en cola: %d", turnosPendientes - 1));
        }
        System.out.println("\n═══════════════════════════════════════════════\n");
    }

    /**
     * Procesa el inicio de atención de un cliente.
     */
    private void procesarIniciarAtencion() {
        int turnosPendientes = servicio.getCantidadTurnosPendientes();
        
        if (turnosPendientes == 0) {
            System.out.println("\nNo hay turnos en la cola de espera.");
            System.out.println("Recuerde: Los clientes deben sacar turno primero (opción 1)");
            System.out.println("antes de poder iniciar la atención.\n");
            System.out.print("Presione Enter para volver al menu principal...");
            scanner.nextLine();
            return;
        }

        Turno turnoActual = servicio.llamarSiguiente();
        
        if (turnoActual == null) {
            System.out.println("No se pudo obtener el siguiente turno.");
            System.out.print("Presione Enter para volver al menu principal...");
            scanner.nextLine();
            return;
        }

        mostrarInicioAtencion(turnoActual, turnosPendientes);
        Pedido pedido = new Pedido(turnoActual);
        procesarPedido(pedido);
    }

    /**
     * Procesa la toma de pedido de un cliente.
     * 
     * @param pedido Pedido en proceso
     */
    private void procesarPedido(Pedido pedido) {
        int opcionPedido;
        Turno turno = pedido.getTurnoAsociado();

        do {
            System.out.printf(MENU_PEDIDO, turno.getNombreCliente(), pedido.calcularTotal());
            
            try {
                opcionPedido = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("❌ Entrada inválida, por favor ingrese un número.");
                scanner.nextLine();
                opcionPedido = 0;
                continue;
            }

            switch (opcionPedido) {
                case 1:
                    mostrarInventarioYAgregar(pedido, CategoriaProducto.MEDICAMENTO);
                    break;
                case 2:
                    mostrarInventarioYAgregar(pedido, CategoriaProducto.PERFUMERIA);
                    break;
                case 3:
                    manejarVerCarrito(pedido);
                    break;
                case 4:
                    realizarPago(pedido);
                    break;
                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcionPedido != 4);
    }

    /**
     * Obtiene el título del inventario en formato plural para mostrar al usuario.
     * 
     * @param categoria Categoría del producto
     * @return Título del inventario en plural
     */
    private String obtenerTituloInventario(CategoriaProducto categoria) {
        if (categoria == CategoriaProducto.MEDICAMENTO) {
            return "INVENTARIO DE MEDICAMENTOS";
        } else if (categoria == CategoriaProducto.PERFUMERIA) {
            return "INVENTARIO DE PERFUMERIA";
        }
        return "INVENTARIO";
    }

    /**
     * Muestra el inventario de una categoría y permite agregar productos al pedido.
     * Permanece en el inventario si el producto no se encuentra, permitiendo reintentar.
     * 
     * @param pedido Pedido actual
     * @param categoria Categoría de productos a mostrar
     */
    private void mostrarInventarioYAgregar(Pedido pedido, CategoriaProducto categoria) {
        List<Producto> inventario = servicio.obtenerInventarioPorCategoria(categoria);

        if (inventario.isEmpty()) {
            System.out.println("\nNo hay productos disponibles en esta categoría.");
            System.out.print("Presione Enter para volver...");
            scanner.nextLine();
            return;
        }

        String tituloInventario = obtenerTituloInventario(categoria);
        boolean productoAgregado = false;
        boolean volver = false;

        do {
            // Mostrar inventario
            System.out.println("\n--- " + tituloInventario + " ---");
            for (Producto producto : inventario) {
                System.out.println(producto.toStringSinId());
            }

            System.out.print("\nIngrese el nombre del producto a agregar (o 'volver' para ir al menu principal.): ");
            String nombreProducto = scanner.nextLine().trim();

            if (nombreProducto.isEmpty() || nombreProducto.equalsIgnoreCase("volver")) {
                volver = true;
                break;
            }

            try {
                Producto productoSeleccionado = servicio.buscarProductoPorNombre(nombreProducto, categoria);

                if (productoSeleccionado == null) {
                    System.out.println("\nProducto no encontrado. Verifique que el nombre sea correcto.");
                    System.out.println("Por favor, intente nuevamente o escriba 'volver' para ir al menu principal.");
                    // El bucle continuará automáticamente mostrando el inventario nuevamente
                    continue;
                }

                // Producto encontrado, agregarlo
                pedido.agregarProducto(productoSeleccionado);
                mostrarConfirmacionProductoAgregado(productoSeleccionado);
                productoAgregado = true;
                mostrarMenuDespuesAgregar(pedido, categoria);
                
            } catch (IllegalArgumentException e) {
                System.out.println("❌ Error: " + e.getMessage());
                System.out.println("Por favor, intente nuevamente o escriba 'volver' para cancelar.");
                // El bucle continuará automáticamente
            }
        } while (!productoAgregado && !volver);
    }

    /**
     * Muestra un mensaje de confirmación cuando se agrega un producto al pedido.
     * 
     * @param producto Producto agregado
     */
    private void mostrarConfirmacionProductoAgregado(Producto producto) {
        System.out.println("\n─────────────────────────────────────────────");
        System.out.println(String.format("Has agregado %s a tu pedido", producto.getNombre().toLowerCase()));
        System.out.println("─────────────────────────────────────────────\n");
    }

    /**
     * Muestra el menú después de agregar un producto al pedido.
     * Permite continuar comprando, ver el carrito o finalizar.
     * El menú se adapta según la categoría desde la cual se agregó el producto.
     * 
     * @param pedido Pedido actual
     * @param categoriaActual Categoría desde la cual se agregó el producto
     */
    private void mostrarMenuDespuesAgregar(Pedido pedido, CategoriaProducto categoriaActual) {
        int opcion;
        
        do {
            mostrarMenuDespuesAgregarTexto(categoriaActual);
            
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("❌ Entrada inválida, por favor ingrese un número.");
                scanner.nextLine();
                opcion = 0;
                continue;
            }

            // Si viene de MEDICAMENTO: opción 1 = Medicamentos, opción 2 = Perfumería
            // Si viene de PERFUMERIA: opción 1 = Perfumería, opción 2 = Medicamentos
            if (categoriaActual == CategoriaProducto.MEDICAMENTO) {
                switch (opcion) {
                    case 1:
                        mostrarInventarioYAgregar(pedido, CategoriaProducto.MEDICAMENTO);
                        break;
                    case 2:
                        mostrarInventarioYAgregar(pedido, CategoriaProducto.PERFUMERIA);
                        break;
                    case 3:
                        manejarVerCarritoDesdeSubmenu(pedido);
                        break;
                    case 4:
                        realizarPago(pedido);
                        return;
                    default:
                        System.out.println("❌ Opción no válida, intente de nuevo.");
                }
            } else { // PERFUMERIA
                switch (opcion) {
                    case 1:
                        mostrarInventarioYAgregar(pedido, CategoriaProducto.PERFUMERIA);
                        break;
                    case 2:
                        mostrarInventarioYAgregar(pedido, CategoriaProducto.MEDICAMENTO);
                        break;
                    case 3:
                        manejarVerCarritoDesdeSubmenu(pedido);
                        break;
                    case 4:
                        realizarPago(pedido);
                        return;
                    default:
                        System.out.println("❌ Opción no válida, intente de nuevo.");
                }
            }
        } while (opcion != 4);
    }

    /**
     * Muestra el texto del menú después de agregar, adaptado según la categoría actual.
     * 
     * @param categoriaActual Categoría desde la cual se agregó el producto
     */
    private void mostrarMenuDespuesAgregarTexto(CategoriaProducto categoriaActual) {
        System.out.println("\n--- ¿Qué desea hacer ahora? ---");
        
        if (categoriaActual == CategoriaProducto.MEDICAMENTO) {
            System.out.println("1. Seguir viendo Medicamentos");
            System.out.println("2. Ver Perfumeria");
        } else { // PERFUMERIA
            System.out.println("1. Seguir viendo Perfumeria");
            System.out.println("2. Ver Medicamentos");
        }
        
        System.out.println("3. Ver carrito");
        System.out.println("4. Finalizar compra");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Maneja la visualización del carrito y las opciones posteriores desde el menú principal.
     * 
     * @param pedido Pedido actual
     */
    private void manejarVerCarrito(Pedido pedido) {
        if (pedido.estaVacio()) {
            carritoDisplay.mostrarCarrito(pedido);
            // El método mostrarCarrito ya maneja el mensaje y pausa
            // Al salir de aquí, volverá al menú de compra automáticamente
            return;
        }

        boolean continuar = true;
        
        while (continuar && !pedido.estaVacio()) {
            carritoDisplay.mostrarCarrito(pedido);
            int opcion = carritoDisplay.mostrarMenuDespuesCarrito();
            
            if (opcion == 1) {
                // Remover item del carrito
                boolean removido = carritoDisplay.removerItemDelCarrito(pedido);
                if (removido) {
                    System.out.print("Presione Enter para continuar...");
                    scanner.nextLine();
                    // Continuar el bucle para mostrar el carrito actualizado
                } else {
                    System.out.print("Presione Enter para continuar...");
                    scanner.nextLine();
                }
            } else if (opcion == 2) {
                // Seguir comprando - mostrar menú de categorías
                mostrarMenuSeguirComprando(pedido);
                continuar = false;
            } else if (opcion == 3) {
                // Finalizar pedido
                realizarPago(pedido);
                continuar = false;
            }
        }
    }

    /**
     * Maneja la visualización del carrito y las opciones posteriores desde el submenú después de agregar.
     * 
     * @param pedido Pedido actual
     */
    private void manejarVerCarritoDesdeSubmenu(Pedido pedido) {
        boolean continuar = true;
        
        while (continuar && !pedido.estaVacio()) {
            carritoDisplay.mostrarCarrito(pedido);
            int opcion = carritoDisplay.mostrarMenuDespuesCarrito();
            
            if (opcion == 1) {
                // Remover item del carrito
                boolean removido = carritoDisplay.removerItemDelCarrito(pedido);
                if (removido) {
                    System.out.print("Presione Enter para continuar...");
                    scanner.nextLine();
                    // Continuar el bucle para mostrar el carrito actualizado
                } else {
                    System.out.print("Presione Enter para continuar...");
                    scanner.nextLine();
                }
            } else if (opcion == 2) {
                // Seguir comprando - volver al menú después de agregar
                continuar = false;
                return; // Volverá al menú después de agregar
            } else if (opcion == 3) {
                // Finalizar pedido
                realizarPago(pedido);
                continuar = false;
                return; // Salir del menú después de agregar
            }
        }
    }

    /**
     * Muestra el menú para continuar comprando después de ver el carrito.
     * 
     * @param pedido Pedido actual
     */
    private void mostrarMenuSeguirComprando(Pedido pedido) {
        System.out.println("\n--- ¿Qué desea ver? ---");
        System.out.println("1. Ver Medicamentos");
        System.out.println("2. Ver Perfumeria");
        System.out.print("Seleccione una opción: ");

        int opcion;
        try {
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarInventarioYAgregar(pedido, CategoriaProducto.MEDICAMENTO);
                    break;
                case 2:
                    mostrarInventarioYAgregar(pedido, CategoriaProducto.PERFUMERIA);
                    break;
                default:
                    System.out.println("❌ Opción no válida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("❌ Entrada inválida, por favor ingrese un número.");
            scanner.nextLine();
        }
    }

    /**
     * Procesa el pago de un pedido.
     * 
     * @param pedido Pedido a pagar
     */
    private void realizarPago(Pedido pedido) {
        if (pedido.estaVacio()) {
            System.out.println("\nEl pedido está vacío. Terminando atención.");
            pedido.getTurnoAsociado().setEstado(EstadoTurno.FINALIZADO);
            return;
        }

        // Mostrar el carrito completo antes del pago
        carritoDisplay.mostrarCarrito(pedido);
        
        // Menú de pago con opción de volver
        boolean continuarPago = true;
        
        while (continuarPago) {
            System.out.println("\n--- PAGO FINAL ---");
            System.out.println("Método de pago:");
            System.out.println("1. Efectivo");
            System.out.println("2. Tarjeta");
            System.out.println("3. Volver al menú de compra");
            System.out.print("Seleccione una opción: ");
            
            try {
                int opcionPago = scanner.nextInt();
                scanner.nextLine();
                
                if (opcionPago == 3) {
                    // Volver al menú de compra
                    return;
                } else if (opcionPago == 1) {
                    // Procesar pago con efectivo
                    procesarPagoConMetodo(pedido, MetodoPago.EFECTIVO);
                    continuarPago = false;
                } else if (opcionPago == 2) {
                    // Procesar pago con tarjeta
                    procesarPagoConMetodo(pedido, MetodoPago.TARJETA);
                    continuarPago = false;
                } else {
                    System.out.println("Opción no válida. Por favor seleccione 1, 2 o 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor ingrese un número.");
                scanner.nextLine();
            }
        }
    }

    /**
     * Procesa el pago con el método seleccionado.
     * 
     * @param pedido Pedido a pagar
     * @param metodoPago Método de pago seleccionado
     */
    private void procesarPagoConMetodo(Pedido pedido, MetodoPago metodoPago) {
        try {
            servicio.procesarPago(pedido, metodoPago);
            mostrarConfirmacionPago(pedido, metodoPago);
            mostrarMensajeDespedida(pedido);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error al procesar el pago: " + e.getMessage());
        }
    }

    /**
     * Muestra un mensaje de confirmación de pago amigable.
     * 
     * @param pedido Pedido procesado
     * @param metodoPago Método de pago utilizado
     */
    private void mostrarConfirmacionPago(Pedido pedido, MetodoPago metodoPago) {
        double total = pedido.calcularTotal();
        String nombreCliente = pedido.getTurnoAsociado().getNombreCliente();
        
        System.out.println("\n═══════════════════════════════════════════════");
        System.out.println("           PAGO PROCESADO EXITOSAMENTE");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println(String.format("\n¡Gracias %s!", nombreCliente));
        System.out.println(String.format("Tu pago de $%.2f ha sido procesado correctamente", total));
        System.out.println(String.format("Método de pago: %s", metodoPago.getDescripcion()));
        System.out.println("═══════════════════════════════════════════════");
    }

    /**
     * Muestra un mensaje de despedida amigable al finalizar la compra y termina el programa.
     * 
     * @param pedido Pedido completado
     */
    private void mostrarMensajeDespedida(Pedido pedido) {
        String nombreCliente = pedido.getTurnoAsociado().getNombreCliente();
        
        System.out.println("\n═══════════════════════════════════════════════");
        System.out.println("           ¡MUCHAS GRACIAS POR TU COMPRA!");
        System.out.println("═══════════════════════════════════════════════");
        System.out.println(String.format("\n%s, esperamos verte pronto.", nombreCliente));
        System.out.println("\n¡Que tengas un excelente día!");
        System.out.println("\n═══════════════════════════════════════════════\n");
        
        System.out.print("Presiona Enter para finalizar...");
        scanner.nextLine();
        
        System.out.println("\n¡Hasta luego!");
        System.exit(0);
    }
}

