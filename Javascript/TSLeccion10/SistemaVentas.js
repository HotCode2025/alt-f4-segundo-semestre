// Clase: Producto
// Responsabilidad: Crear objetos del tipo Producto

class Producto {
  static contadorProductos = 0;

  constructor(nombre, precio) {
    Producto.contadorProductos++;
    this.idProducto = Producto.contadorProductos;
    this.nombre = nombre;
    this.precio = precio;
  }

  // Devuelve el ID del producto
  getIdProducto() {
    return this.idProducto;
  }

  // Devuelve el nombre del producto
  getNombre() {
    return this.nombre;
  }

  // Setea (modifica) el nombre del producto
  setNombre(nombre) {
    this.nombre = nombre;
  }

  // Devuelve el precio del producto
  getPrecio() {
    return this.precio;
  }
  // Setea (modifica) el precio del producto
  setPrecio(precio) {
    this.precio = precio;
  }

  // Representación en texto del producto
  toString() {
    return `${this.idProducto}. ${this.nombre} - $${this.precio}`;
  }
}

// Clase: Orden
// Responsabilidad:
// - Crear objetos del tipo Orden
// - Administrar los productos dentro de una orden

class Orden {
  // contador de órdenes, contador productos agregados y constante de máximo de productos
  static contadorProductosAgregados = 0;
  static contadorOrdenes = 0;
  static MAX_PRODUCTOS = 5;

  constructor() {
    // Incrementa el contador global de órdenes
    Orden.contadorOrdenes++;
    // Asigna idOrden
    this.idOrden = Orden.contadorOrdenes;
    // Inicializa el arreglo de productos
    this.productos = [];
  }

  // Intenta agregar un producto; si supera el límite lanza un Error
  agregarProducto(producto) {
    // Si no se alcanzó el máximo, agrega el producto
    if (this.productos.length < Orden.MAX_PRODUCTOS) {
      this.productos.push(producto); // agrega el producto al arreglo
      this.contadorProductosAgregados++; // incrementa contador
      console.log(` Producto agregado a la orden: ${producto.getNombre()}`);
    } else {
      // Si ya hay MAX_PRODUCTOS, lanzamos un Error
        console.log(`No se pueden agregar más de ${Orden.MAX_PRODUCTOS} productos a la orden #${this.idOrden}.`);
    }
  }

  // Suma los precios de los productos incluidos en la orden
  calcularTotal() {
    let total = 0;
    for (let producto of this.productos) {
      total += producto.getPrecio();
    }
    return total;
  }

  // Muestra en consola los detalles de la orden y el total
  mostrarOrden() {
    console.log(`========= ORDEN #${this.idOrden} =========`);
    console.log("Productos en la orden:");
    for (let producto of this.productos) {
      console.log(producto.toString());
    }
    console.log(`------------------------------------------`);
    console.log(`Total a pagar: $${this.calcularTotal()}`);
    console.log(`==========================================`);
  }
}

// VentasTest - Prueba del sistema
// Responsabilidad: crear objetos Producto y Orden y probar su funcionamiento

// Crear productos de ejemplo
const producto1 = new Producto("Camisa", 35000);
const producto2 = new Producto("Pantalón", 55000);
const producto3 = new Producto("Zapatillas", 140000);
const producto4 = new Producto("Gorra", 15000);
const producto5 = new Producto("Buzo", 30000);
const producto6 = new Producto("Medias", 5000); // Excede el límite si se intenta agregar

// Crear primera orden
const orden1 = new Orden();

// Agregar productos a la orden (estos 5 deben agregarse correctamente)
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto4);
orden1.agregarProducto(producto5);
orden1.agregarProducto(producto6);


// Mostrar la orden 1 completa (solo contendrá los 5 primeros productos)
orden1.mostrarOrden();


// Calcular totales de ordenes
orden1.calcularTotal(); // Total de orden1 (Suma de 5 productos máximo)
