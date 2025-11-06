# 🏥 Sistema de Gestión de Farmacia - ALT+F4

Este es nuestro **Proyecto Integrador de Java** hecho para el **Semestre 2**, que simula un sistema completo de gestión de farmacia con funcionalidades de atención al cliente, gestión de turnos, inventario de productos (medicamentos y perfumería), y procesamiento de pedidos.

## 👥 Integrantes del Grupo ALT+F4

- **Francisco José Martín**
- **Rodrigo Haro**
- **Andrea Vargas**
- **Joel Francisco Martín**
- **Gabriel Jauregui**

## 🚀 Cómo Iniciar el Proyecto

### Pasos para Ejecutar

1. **Compilar el proyecto:**
   ```bash
   javac -d build/classes -sourcepath src src/ProyectoFarmacia/ui/FarmaciaUI.java
   ```

2. **Ejecutar la aplicación:**
   ```bash
   java -cp build/classes ProyectoFarmacia.ui.FarmaciaUI
   ```

   O simplemente ejecutar directamente:
   ```bash
   java -cp build/classes ProyectoFarmacia.ui.FarmaciaUI
   ```

## 📁 Estructura del Proyecto

```
src/ProyectoFarmacia/
├── enums/              # Enumeraciones
│   ├── CategoriaProducto.java
│   ├── EstadoTurno.java
│   └── MetodoPago.java
├── model/              # Modelos de datos (Entidades)
│   ├── Medicamento.java
│   ├── Pedido.java
│   ├── Perfumeria.java
│   ├── Producto.java
│   └── Turno.java
├── service/            # Lógica de negocio
│   └── FarmaciaServicio.java
└── ui/                 # Interfaz de usuario
    ├── FarmaciaUI.java       # Clase principal (punto de entrada)
    └── view/
        └── CarritoDisplay.java  # Componente de vista del carrito
```

## 🎯 Funcionalidades Principales

### 1. Gestión de Turnos
- Los clientes pueden sacar turnos para ser atendidos
- Sistema de cola FIFO (First In, First Out)
- Estados de turno: PENDIENTE, EN_ATENCION, FINALIZADO

### 2. Gestión de Inventario
- **Medicamentos**: Lista de medicamentos disponibles mostrando nombre y precio
- **Perfumería**: Lista de productos de perfumería mostrando nombre y precio

### 3. Sistema de Carrito
- Agregar productos al carrito
- Ver carrito con lista detallada de productos y totales
- Remover items del carrito
- Seguir comprando o finalizar pedido

### 4. Procesamiento de Pedidos
- Visualización completa del carrito antes del pago
- Selección de método de pago (Efectivo/Tarjeta)
- Opción de volver al menú antes de finalizar
- Confirmación de pago y mensaje de despedida


**Grupo ALT+F4** - Semestre 2

